package com;

import com.pluralsight.BasicMembership;
import com.pluralsight.FamilyMembership;
import com.pluralsight.Membership;
import com.pluralsight.PremiumMembership;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== Gym Memberships ===");
        Membership first = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        System.out.printf("%s, %d months, $%.2f per month", first.getMemberName(), first.getMonths(), first.getMonthlyPrice());
        System.out.println();
        BasicMembership second = new BasicMembership("Alice Johnson", 6, new BigDecimal("25.00"), false);
        System.out.printf("%s, %d months, $%.2f per month", second.getMemberName(), second.getMonths(), second.getMonthlyPrice());
        System.out.println();
        BasicMembership third = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);
        System.out.printf("%s, %d months, $%.2f per month", third.getMemberName(), third.getMonths(), third.getMonthlyPrice());
        System.out.println();
        PremiumMembership fourth = new PremiumMembership("Carol White",12,new BigDecimal("30.00"),2);
        System.out.printf("%s, %d months, $%.2f per month",fourth.getMemberName(),fourth.getMonths(),fourth.getMonthlyPrice());
        System.out.println();
        PremiumMembership fifth = new PremiumMembership("Frank Miller",3,new BigDecimal("30.00"),0);
        System.out.printf("%s, %d months, $%.2f per month",fifth.getMemberName(),fifth.getMonths(),fifth.getMonthlyPrice());
        System.out.println();
        FamilyMembership sixth = new FamilyMembership("Grace Lee",12,new BigDecimal("30.00"),3);
        System.out.printf("%s, %d months, $%.2f per month",sixth.getMemberName(),sixth.getMonths(),sixth.getMonthlyPrice());
        System.out.println();
        FamilyMembership seven = new FamilyMembership("Emma Wilson",6,new BigDecimal("30.00"),1);
        System.out.printf("%s, %d months, $%.2f per month",seven.getMemberName(),seven.getMonths(),seven.getMonthlyPrice());
        System.out.println();
        System.out.println("--- Guest passes---");

        fourth.useGuestPass();
        fourth.useGuestPass();
        fourth.useGuestPass();
        fifth.useGuestPass();








    }


}
