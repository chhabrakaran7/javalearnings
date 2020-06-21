// Main Class //

package coding_exercises.EvenDigitSum;

import java.util.Scanner;

public class evenDigitSum_Main {
    public static void main(String[] args) {
        Scanner evenNumberSum = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int myevenSum = evenNumberSum.nextInt();

        int sum = evenDigitSum.getEvenDigitSum(myevenSum);
        System.out.println("sum of the even numbers in the passed number = " + sum);
    }
}
