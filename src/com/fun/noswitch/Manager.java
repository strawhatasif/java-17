package com.fun.noswitch;

import java.math.BigDecimal;

public final class Manager extends Employee {

    public static final double MANAGER_PERCENTAGE = 0.25;

    @Override
    public BigDecimal determineBonus(double salary) {
        return BigDecimal.valueOf(salary * MANAGER_PERCENTAGE);
    }
}
