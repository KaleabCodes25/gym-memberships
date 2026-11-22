package com.pluralsight;

import java.math.BigDecimal;

public class CorporateMembership extends Membership {

    private BigDecimal employerShare;

    public CorporateMembership(String memberName, int months, BigDecimal baseRate
            , BigDecimal employerShare) {
        super(memberName, months, baseRate);
        this.employerShare = employerShare;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        if(getEmployerShare().compareTo(new BigDecimal("0.00")) > 0){
            return getBaseRate().subtract(getEmployerShare().multiply(getBaseRate()));
        }else {
            return getBaseRate();
        }
    }

    @Override
    public BigDecimal getSignUpFee(){
        return new BigDecimal("0.00");
    }

    public BigDecimal getEmployerShare() {
        return employerShare;
    }

    public void setEmployerShare(BigDecimal employerShare) {
        this.employerShare = employerShare;
    }

    @Override
    public String toString() {
        return "Corporate " + " | " + getMemberName() + " | " +  getMonths() +
                " months " + " | " + "employer share: " + getEmployerShare();

    }
}
