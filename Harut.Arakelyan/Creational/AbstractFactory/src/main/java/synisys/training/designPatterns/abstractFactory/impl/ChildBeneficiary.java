package synisys.training.designPatterns.abstractFactory.impl;

import synisys.training.designPatterns.abstractFactory.api.Beneficiary;

/**
 * @author harut.arakelyan
 */
public class ChildBeneficiary implements Beneficiary {
    @Override
    public String getBeneficiaryInfo() {
        return "ChildBeneficiary";
    }

    @Override
    public String getBankAccount() {
        return "0900837568909";
    }

    @Override
    public String getContactNumber() {
        return "+374777777777";
    }
}
