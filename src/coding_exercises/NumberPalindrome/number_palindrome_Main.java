// Main Class //

package coding_exercises.NumberPalindrome;

public class number_palindrome_Main {
    public static void main(String[] args) {
        boolean checkPalindrome = number_palindrome.isPalindrome(-1221);
        System.out.println("Is the supplied number a palindrome = " + checkPalindrome);
        boolean checkPalindrome1 = number_palindrome.isPalindrome(707);
        System.out.println("Is the supplied number a palindrome = " + checkPalindrome1);
        boolean checkPalindrome2 = number_palindrome.isPalindrome(11212);
        System.out.println("Is the supplied number a palindrome = " + checkPalindrome2);
    }
}
