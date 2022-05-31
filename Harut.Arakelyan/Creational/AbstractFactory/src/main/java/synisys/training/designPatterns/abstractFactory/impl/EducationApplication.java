package synisys.training.designPatterns.abstractFactory.impl;

import synisys.training.designPatterns.abstractFactory.api.Application;
import synisys.training.designPatterns.abstractFactory.api.Beneficiary;
import synisys.training.designPatterns.abstractFactory.api.Program;

import java.util.Map;

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
    public Map<String, String> providePaymentInfo() {
        //it will be get from Beneficiary and Program
        return null;
    }


}
