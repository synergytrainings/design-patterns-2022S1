package synisys.training.designPatterns.abstractFactory.impl;

import synisys.training.designPatterns.abstractFactory.api.Application;
import synisys.training.designPatterns.abstractFactory.api.Beneficiary;
import synisys.training.designPatterns.abstractFactory.api.Program;

/**
 * @author harut.arakelyan
 */
public class EducationApplication extends Application {
    @Override
    public Beneficiary defineBeneficiary() {
        return new SchoolBeneficiary();
    }

    @Override
    public Program defineProgram() {
        return new HighSchoolProgram();
    }

    @Override
    public void pay() {
      //check verification and call paymentService to pay
        System.out.println("Send School pay request");
    }
}
