package synisys.training.designPatterns.abstractFactory.impl;

import synisys.training.designPatterns.abstractFactory.api.Program;

import java.math.BigDecimal;

/**
 * @author harut.arakelyan
 */
public class HighSchoolProgram implements Program {

    @Override
    public String getName() {
        return "High School Program";
    }

    @Override
    public BigDecimal getMonthlyAmount() {
        return new BigDecimal(40000);
    }
}
