// Main Class //

package coding_exercises.NumberPalindrome;

import java.util.Scanner;

public class number_palindrome_Main {
    public static void main(String[] args) {
        // Scanner keyword: Take user input to check if the supplied number is a palindrome //
        Scanner myNum = new Scanner(System.in);
        System.out.println("Enter the number to verify as palindrome: ");
        int number = myNum.nextInt();
        boolean checkPalindrome = number_palindrome.isPalindrome(number);
        System.out.println("Is the supplied number a palindrome = " + checkPalindrome);
        }
}
