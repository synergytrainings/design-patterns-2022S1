package synisys.training.designPatterns.abstractFactory.impl;

import synisys.training.designPatterns.abstractFactory.api.Beneficiary;

/**
 * @author harut.arakelyan
 */
public class SchoolBeneficiary implements Beneficiary {
    @Override
    public String getBeneficiaryInfo() {
        return "SchoolBeneficiary";
    }

    @Override
    public String getBankAccount() {
        return "8708701328740123";
    }

    @Override
    public Boolean verifyBeforePayment() {
        //school
        return true;
    }

    @Override
    public String getContactNumber() {
        return "+37410000000";
    }
}
