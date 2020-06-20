// Challenge //
/*
 * Print even numbers between a range "number" and "endNumber"
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

 * Create a method called "isEvenNumber" that:
    >> takes a parameter of type int
    >> Its purpose is to determine if the argument passed to the method is an even number or not.
    >> return true if an even number, otherwise return false;

 * Call the "isEvenNumber" method in the main function to print even numbers in a range.
 */

package ControlFlowStatements.while_dowhile_Statement;

public class challenge_while_do_while {
    public static void main(String[] args) {
        int number = 0;
        int endNumber = 20;
        int evenNumberFound = 0;

        while (number <= endNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            // Print output //
            System.out.println("Even number : " + number);
            evenNumberFound++;
            if (evenNumberFound >=5){
                break;
            }
        }
        // Number of even number found //
        System.out.println("Total number of even number found is/are: " + evenNumberFound);
    }
    // Method: Check if number is even //
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
