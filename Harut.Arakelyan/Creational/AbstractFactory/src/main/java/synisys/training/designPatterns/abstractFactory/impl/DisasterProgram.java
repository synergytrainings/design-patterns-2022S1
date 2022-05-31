package synisys.training.designPatterns.abstractFactory.impl;

import synisys.training.designPatterns.abstractFactory.api.Program;

import java.math.BigDecimal;

/**
 * @author harut.arakelyan
 */
public class DisasterProgram implements Program {

    @Override
    public String getName() {
        return "Basic disaster help";
    }

    @Override
    public BigDecimal getMonthlyAmount() {
        return new BigDecimal(20000);
    }
}
