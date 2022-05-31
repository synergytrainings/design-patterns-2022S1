package synisys.training.designPatterns.abstractFactory.impl;

import synisys.training.designPatterns.abstractFactory.api.Application;
import synisys.training.designPatterns.abstractFactory.api.Beneficiary;
import synisys.training.designPatterns.abstractFactory.api.Program;

/**
 * @author harut.arakelyan
 */
public class SWApplication extends Application {
    @Override
    public Beneficiary defineBeneficiary() {
        return new ChildBeneficiary();
    }

    @Override
    public Program defineProgram() {
        return new DisasterProgram();
    }

    @Override
    public void pay() {
      //check verification and call paymentService to pay
        System.out.println("Send Household pay request");
    }
}
