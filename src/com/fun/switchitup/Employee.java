package com.fun.switchitup;

import java.math.BigDecimal;

sealed class Employee permits IndividualContributorRole, ManagementRole {
    BigDecimal determineBonus(double salary) {
        return BigDecimal.valueOf(salary);
    }
}
