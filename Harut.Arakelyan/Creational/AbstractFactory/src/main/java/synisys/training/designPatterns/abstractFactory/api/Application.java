package synisys.training.designPatterns.abstractFactory.api;

import java.math.BigDecimal;

/**
 * @author harut.arakelyan
 */
public abstract class Application {
    public abstract Beneficiary defineBeneficiary();
    public abstract Program defineProgram();
    public boolean registerApplication(){
        // Send Program and Beneficiary info to external API
        return Math.round(Math.random()*100)%2 == 0;
    }

    public abstract void pay();

}
