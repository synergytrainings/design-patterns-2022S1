package synisys.training.designPatterns.abstractFactory;

import synisys.training.designPatterns.abstractFactory.api.Application;
import synisys.training.designPatterns.abstractFactory.impl.EducationApplication;
import synisys.training.designPatterns.abstractFactory.impl.HealthyApplication;
import synisys.training.designPatterns.abstractFactory.impl.SWApplication;

/**
 * @author harut.arakelyan
 */
public class ApplicationFactory {

    public Application createApplication(String governmentProgram){
       switch (governmentProgram.toLowerCase()){
           case "clothing":
               return new SWApplication();
           case "dental":
               return new HealthyApplication();
           case "education":
               return  new EducationApplication();
               /// other cases
           default: throw new IllegalArgumentException("No such program");
       }
    }
}
