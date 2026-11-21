package com.pluralsight;

import java.math.BigDecimal;

public class PremiumMembership extends Membership {
    private int guestPasses;

    public PremiumMembership(String memberName, int months, BigDecimal baseRate, int guestPasses) {
        super(memberName, months, baseRate);
        this.guestPasses = guestPasses;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        return getBaseRate().add(new BigDecimal("18.50"));
    }

    public void useGuestPass(){
        if(guestPasses > 0){
            guestPasses--;

            System.out.printf("%s used a guest pass. Pases left: %d%n",getMemberName(),guestPasses);
        }else{
            System.out.println(getMemberName()+ " has no guest passes left!!");
        }
    }

    public int getGuestPasses() {
        return guestPasses;
    }

    public void setGuestPasses(int guestPasses) {
        this.guestPasses = guestPasses;
    }

    @Override
    public String toString() {
        return "PremiumMembership{" +
                "guestPasses=" + guestPasses +
                '}';
    }
}
