package com.pluralsight;

import java.math.BigDecimal;

public class FamilyMembership extends Membership{
    private int extraMembers;

    public FamilyMembership(String memberName, int months, BigDecimal baseRate, int extraMembers) {
        super(memberName, months, baseRate);
        this.extraMembers = extraMembers;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        BigDecimal monthly;
        if(extraMembers >= 3){
            monthly = getBaseRate().add(new BigDecimal("12.50").multiply(BigDecimal.valueOf(extraMembers)));
            monthly = monthly.multiply(new BigDecimal("0.90"));

        }else{
            monthly = getBaseRate().add(                          new BigDecimal("12.50").multiply(BigDecimal.valueOf(extraMembers)));
        }
        return monthly;
    }

    public int getExtraMembers() {
        return extraMembers;
    }

    public void setExtraMembers(int extraMembers) {
        this.extraMembers = extraMembers;
    }

    @Override
    public String toString() {
        return "Family " + " | " + getMemberName() + " | " + getMonths() +
                " months " + " | " + "extraMembers: " + extraMembers;
    }
}
