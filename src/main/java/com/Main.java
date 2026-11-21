package com;

import com.pluralsight.BasicMembership;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BasicMembership first = new BasicMembership("henry", 3, new BigDecimal("30.00"), true);
        System.out.println(first.getMemberName());
        System.out.println(first.getMonthlyPrice());

        BasicMembership alice = new BasicMembership("alice Johnson", 6,
                new BigDecimal("25.00"), true);
    }

}
