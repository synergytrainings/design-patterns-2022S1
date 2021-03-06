package synisys.training.designPatterns.abstractFactory.impl;

import synisys.training.designPatterns.abstractFactory.api.Beneficiary;

/**
 * @author harut.arakelyan
 */
public class HospitalBeneficiary implements Beneficiary {
    @Override
    public String getBeneficiaryInfo() {
        return "HospitalBeneficiary";
    }

    @Override
    public String getBankAccount() {
        return "37012837012";
    }

    @Override
    public String getContactNumber() {
        return "+3741189832398";
    }
}
