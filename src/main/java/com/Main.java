package com;

import com.pluralsight.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.print("=== Gym Memberships ===\n");
        //Membership first = new Membership("Henry Clark", 3, new BigDecimal("30.00"));

        BasicMembership second = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);

        BasicMembership third = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);

        PremiumMembership four = new PremiumMembership("Carol White", 12, new BigDecimal("30.00"), 2);

        PremiumMembership five = new PremiumMembership("Frank Miller", 3, new BigDecimal("30.00"), 0);

        FamilyMembership six = new FamilyMembership("Grace Lee", 12, new BigDecimal("30.00"), 3);

        FamilyMembership seven = new FamilyMembership("Emma Wilson", 6, new BigDecimal("30.00"), 1);

        CorporateMembership eight = new CorporateMembership("Olivia Martin", 12, new BigDecimal("30.00"), new BigDecimal("0.40"));
        List<Membership> memberships = new ArrayList<>();
        ;
        memberships.add(second);
        memberships.add(third);
        memberships.add(four);
        memberships.add(five);
        memberships.add(six);
        memberships.add(seven);
        memberships.add(eight);

        printCosts(memberships);
        secondLoop(memberships);
        thirdLoop(memberships);

    }

    public static void printCosts(List<Membership> memberships) {
        BigDecimal monthlyPriceTotal = BigDecimal.ZERO;
        BigDecimal allContract = BigDecimal.ZERO;
        Membership largestContract = null;
        for (Membership membership : memberships) {
            if (largestContract == null || membership.getContractTotal().compareTo(largestContract.getContractTotal()) > 0) {
                largestContract = membership;
            }

            System.out.println(membership);
            System.out.printf("Monthly price: $%.2f, sing-up fee: $%.2f, contract total: $%.2f%n", membership.getMonthlyPrice(), membership.getSignUpFee(), membership.getContractTotal());

            monthlyPriceTotal = monthlyPriceTotal.add(membership.getMonthlyPrice());
            allContract = allContract.add(membership.getContractTotal());

        }
        System.out.print("--- Totals ---\n");
        System.out.printf("Memberships: %d%n", memberships.size());
        System.out.printf("Monthly income: $%.2f%n", monthlyPriceTotal);
        System.out.printf("All contracts: $%.2f%n", allContract);
        System.out.printf("Largest contract: %s, $%.2f%n", largestContract.getMemberName(), largestContract.getContractTotal());

    }

    public static void secondLoop(List<Membership> memberships) {
        System.out.println("--- Front desk notes ---");
        for (Membership membership : memberships) {
            if (membership instanceof BasicMembership member) {
                if (member.isOffPeakOnly()) {
                    System.out.println(membership.getMemberName() + ": entry between 10:00 and 16:00 only");
                }
            } else if (membership instanceof PremiumMembership) {
                ((PremiumMembership) membership).useGuestPass();
            } else if (membership instanceof FamilyMembership) {
                System.out.printf("%s: print %d key cards%n", membership.getMemberName(), ((FamilyMembership) membership).getExtraMembers() + 1);
            }
        }
    }

    public static void thirdLoop(List<Membership> memberships) {
        System.out.println("--- Kinds ---");
        for (Membership membership : memberships) {
            System.out.println(membership.getMemberName() + ": " + membership.getClass().getSimpleName());
        }
    }


}
