package com.pluralsight;

import java.math.BigDecimal;

public class BasicMembership extends Membership {
    private boolean offPeakOnly;

    public BasicMembership(String memberName, int months, BigDecimal baseRate, boolean offPeakOnly) {
        super(memberName, months, baseRate);
        this.offPeakOnly = offPeakOnly;
    }
    // Class 'BasicMembership' must either be declared abstract or implement abstract method 'getMonthlyPrice()' in 'Membership'.
    @Override
    public BigDecimal getMonthlyPrice() {
        if(offPeakOnly){
            return getBaseRate().subtract(new BigDecimal("5.00"));
        }else {
            return getBaseRate();
        }
    }

    public boolean isOffPeakOnly() {
        return offPeakOnly;
    }

    public void setOffPeakOnly(boolean offPeakOnly) {
        this.offPeakOnly = offPeakOnly;
    }

    @Override
    public String toString() {
        return "Basic " + " | " + getMemberName() + " | " +
                getMonths() + " months " + " | " + " off-Peak only: " + offPeakOnly;

    }

}
