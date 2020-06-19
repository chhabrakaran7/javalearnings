// "for" statement //

/*
1. Executing code more than one iteration we use for loop.
2. Explained with use cases and a challenge
 */

package ControlFlowStatements.forStatement;

public class for_Main {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        // Example of "for" usage //
        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
        // Challenge //
        /*
         * Using the for statement, call the calculateInterest method with
         * amount of 10000 with an interest of 2,3,4,5,6,7 and 8
         * and print the result to console window
         */
        // Incremental loop //
        System.out.println("Example of an incremental loop below: ");
        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000.0, i)));
            // String.format("%.sf, METHOD CALL) executes the method and trims the result to 2 decimal places and prints as a string//
        }
        // Decremental loop //
        System.out.println("Example of a decremental loop below");
        for(int i=8; i>1; i--) {
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000.0, i)));
            // String.format("%.sf, METHOD CALL) executes the method and trims the result to 2 decimal places and prints as a string//
        }
    }
    // method //
    public static double calculateInterest(double amount, double interestRate) {
        return (amount) * (interestRate/100);
    }
}
