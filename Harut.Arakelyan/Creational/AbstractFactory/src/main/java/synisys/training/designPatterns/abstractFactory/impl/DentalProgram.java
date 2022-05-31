package synisys.training.designPatterns.abstractFactory.impl;

import synisys.training.designPatterns.abstractFactory.api.Program;

import java.math.BigDecimal;

/**
 * @author harut.arakelyan
 */
public class DentalProgram implements Program {

    @Override
    public String getName() {
        return "DentalProgram";
    }

    @Override
    public BigDecimal getMonthlyAmount() {
        return new BigDecimal(20000);
    }
}
