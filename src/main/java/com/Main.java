package com;

import com.pluralsight.BasicMembership;
import com.pluralsight.FamilyMembership;
import com.pluralsight.Membership;
import com.pluralsight.PremiumMembership;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.print("=== Gym Memberships ===\n");
        Membership first = new Membership("Henry Clark", 3, new BigDecimal("30.00"));

        BasicMembership second = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);

        BasicMembership third = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);

        PremiumMembership four = new PremiumMembership("Carol White",12,new BigDecimal("30.00"),2);

        PremiumMembership five = new PremiumMembership("Frank Miller",3,new BigDecimal("30.00"),0);

        FamilyMembership six = new FamilyMembership("Grace Lee",12,new BigDecimal("30.00"),3);

        FamilyMembership seven = new FamilyMembership("Emma Wilson",6,new BigDecimal("30.00"),1);

        List<Membership> memberships = new ArrayList<>();
        memberships.add(first);
        memberships.add(second);
        memberships.add(third);
        memberships.add(four);
        memberships.add(five);
        memberships.add(six);
        memberships.add(seven);
        printCosts(memberships);

    }
    public static void printCosts(List<Membership> memberships){
        BigDecimal monthlyPriceTotal = BigDecimal.ZERO;
        BigDecimal allContract = BigDecimal.ZERO;
        for (Membership membership : memberships) {
            System.out.println(membership);
            System.out.printf("Monthly price: $%.2f, sing-up fee: $%.2f, contract total: $%.2f%n",membership.getMonthlyPrice(),membership.getSignUpFee(),membership.getContractTotal());
            monthlyPriceTotal = monthlyPriceTotal.add(membership.getMonthlyPrice());
            allContract = allContract.add(membership.getContractTotal());

        }
        System.out.println("--- Totals ---");
        System.out.printf("Memberships: %d ", memberships.size());
        System.out.printf("Monthly income: $%.2f%n", monthlyPriceTotal);
        System.out.printf("All contracts: $%.2f%n", allContract);

    }


}
