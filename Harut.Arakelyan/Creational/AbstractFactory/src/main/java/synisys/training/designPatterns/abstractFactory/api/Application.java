package synisys.training.designPatterns.abstractFactory.api;


import java.util.Map;

/**
 * @author harut.arakelyan
 */
public abstract class Application {
    public abstract Beneficiary defineBeneficiary();
    public abstract Program defineProgram();

    public abstract Map<String, String> providePaymentInfo();

}
