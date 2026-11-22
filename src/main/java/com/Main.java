package com;

import com.pluralsight.BasicMembership;
import com.pluralsight.FamilyMembership;
import com.pluralsight.Membership;
import com.pluralsight.PremiumMembership;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        System.out.print("=== Gym Memberships ===\n");
        Membership first = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        System.out.print(first);
        System.out.println();
        BasicMembership second = new BasicMembership("Alice Johnson", 6, new BigDecimal("25.00"), true);
        System.out.print(second);
        System.out.println();
        BasicMembership third = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);
        System.out.print(third);
        System.out.println();
        PremiumMembership fourth = new PremiumMembership("Carol White",12,new BigDecimal("30.00"),2);
        System.out.print(fourth);
        System.out.println();
        PremiumMembership fifth = new PremiumMembership("Frank Miller",3,new BigDecimal("30.00"),0);
        System.out.print(fifth);
        System.out.println();
        FamilyMembership sixth = new FamilyMembership("Grace Lee",12,new BigDecimal("30.00"),3);
        System.out.print(sixth);
        System.out.println();
        FamilyMembership seven = new FamilyMembership("Emma Wilson",6,new BigDecimal("30.00"),1);
        System.out.print(seven);
        System.out.println();
        System.out.print("--- Guest passes---\n");
        fourth.useGuestPass();
        fourth.useGuestPass();
        fourth.useGuestPass();
        fifth.useGuestPass();
        System.out.print("--- Sign-up fee and contract total ---\n");
        System.out.printf("%s: fee $%.2f, total $%.2f%n",first.getMemberName(),first.getSignUpFee(),first.getContractTotal());
        System.out.printf("%s: fee $%.2f, total $%.2f%n",fourth.getMemberName(),fourth.getSignUpFee(),fourth.getContractTotal());
        System.out.printf("%s: fee $%.2f, total $%.2f%n",fifth.getMemberName(),fifth.getSignUpFee(),fifth.getContractTotal());
        System.out.printf("%s: fee $%.2f, total $%.2f%n",sixth.getMemberName(),sixth.getSignUpFee(),sixth.getContractTotal());









    }


}
