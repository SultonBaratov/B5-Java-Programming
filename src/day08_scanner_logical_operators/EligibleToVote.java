package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "James Bond";
        boolean isCitizen = true;
        boolean haCriminalBackground = true;
        int age = 30;

        boolean is18orOlder = age >= 18;

        boolean isEligible = is18orOlder && isCitizen && haCriminalBackground;

        System.out.println(name + " is eligible to vote " +isEligible);
        System.out.println(name + " is eligible to vote " +isEligible);
        System.out.println();


    }
}
