package com.pluralsight;

import java.math.BigDecimal;

public class BasicMembership extends Membership {
    private boolean offPeakOnly;

    public BasicMembership(String memberName, int months, BigDecimal baseRate, boolean ofPeakOnly) {
        super(memberName, months, baseRate);
        this.offPeakOnly = ofPeakOnly;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        if(offPeakOnly){
            return getBaseRate().subtract(new BigDecimal("5.00"));
        }else {
            return getBaseRate();
        }
    }

    public boolean isOfPeakOnly() {
        return offPeakOnly;
    }

    public void setOfPeakOnly(boolean ofPeakOnly) {
        this.offPeakOnly = ofPeakOnly;
    }

    @Override
    public String toString() {
        return "BasicMembership{" +
                "ofPeakOnly=" + offPeakOnly +
                '}';
    }

}
