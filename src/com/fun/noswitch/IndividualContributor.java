package com.fun.noswitch;

import java.math.BigDecimal;

public final class IndividualContributor extends Employee {

    public static final double INDIVIDUAL_CONTRIBUTOR_PERCENTAGE = 0.1;

    @Override
    public BigDecimal determineBonus(double salary) {
        return BigDecimal.valueOf(salary * INDIVIDUAL_CONTRIBUTOR_PERCENTAGE);
    }
}
