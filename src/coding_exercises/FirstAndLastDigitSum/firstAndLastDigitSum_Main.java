// Main Class //

package coding_exercises.FirstAndLastDigitSum;

import java.util.Scanner;

public class firstAndLastDigitSum_Main {
    public static void main(String[] args) {
        // User input for the number to calculate sum of first and last digit //
        Scanner mysum = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = mysum.nextInt();
        
        int calculateSum = firstAndLastDigitSum.sumFirstAndLastDigit(number);
        System.out.println("calculateSum = " + calculateSum);
        
        
    }
}
