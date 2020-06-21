// Code exercise 19 //
/*
The problem statement can be found under src/coding_exercises/NumberPalindrome/CodeExercise.txt
 */

package coding_exercises.NumberPalindrome;

public class number_palindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int validateNumber = number; // Store the supplied number to validate at the end
        // Variable to store reverse of the number
        while (number != 0) {
            int lastDigitOfPalindrome = number % 10; // Calculate last digit
            reverse = (reverse * 10) + lastDigitOfPalindrome; // Increase the place value
            number = number / 10; // Remove last digit
        }
        if (validateNumber == reverse) {
            return true;
        } else {
            return false;
        }
    }
}