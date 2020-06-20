// Control flow statement //
/*
: while statement :
1. A user wants an iteration to run until a condition is met.
2. while is used when a user doesn't know how many times they need to loop

: do while statement :
1. A do while statement is always executed at least once rest is similar to the while statement.
 */

package ControlFlowStatements.while_dowhile_Statement;

public class while_do_while_Main {
    public static void main(String[] args) {
        // Example of while //
        int count = 0;
        while (count != 6) {
            System.out.println("Count value from while loop is " + count);
            count++;
        }
        // Validate with "for" loop //
        for (count = 0; count != 6; count++) {
            System.out.println("Count value from for loop is " + count);
        }
        // Example of do while //
        count = 0; // Re-initialize the count variable as it's changed from above code //
        do {
            System.out.println("Count value from for do-while loop is " + count);
            count++;
        } while (count !=6);
    }
}
