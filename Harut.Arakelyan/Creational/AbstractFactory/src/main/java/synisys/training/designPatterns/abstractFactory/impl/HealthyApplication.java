package synisys.training.designPatterns.abstractFactory.impl;

import synisys.training.designPatterns.abstractFactory.api.Application;
import synisys.training.designPatterns.abstractFactory.api.Beneficiary;
import synisys.training.designPatterns.abstractFactory.api.Program;

/**
 * @author harut.arakelyan
 */
public class HealthyApplication extends Application {
    @Override
    public Beneficiary defineBeneficiary() {
        return new HospitalBeneficiary();
    }

    @Override
    public Program defineProgram() {
        return new DentalProgram();
    }

    @Override
    public void pay() {
      //check verification and call paymentService to pay
        System.out.println("Send Hospital pay request");
    }
}
