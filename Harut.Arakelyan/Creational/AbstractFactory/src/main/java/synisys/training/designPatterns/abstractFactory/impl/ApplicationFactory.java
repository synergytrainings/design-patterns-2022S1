package synisys.training.designPatterns.abstractFactory.impl;

import synisys.training.designPatterns.abstractFactory.api.Application;

import java.util.HashMap;
import java.util.Map;

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
