// Main Class //

package coding_exercises.EqualSumChecker;

public class sumChecker_Main {
    public static void main(String[] args) {
        boolean leftEqualToRight = equalSum_Checker.hasEqualSum(1, 1, 2);
        System.out.println("Is the sum of first two numbers equal to third number: " + leftEqualToRight);
        boolean leftEqualToRight1 = equalSum_Checker.hasEqualSum(1, 1, 0);
        System.out.println("Is the sum of first two numbers equal to third number: " + leftEqualToRight1);
        boolean leftEqualToRight2 = equalSum_Checker.hasEqualSum(1, 1, 3);
        System.out.println("Is the sum of first two numbers equal to third number: " + leftEqualToRight2);
        boolean leftEqualToRight3 = equalSum_Checker.hasEqualSum(1, -1, 0);
        System.out.println("Is the sum of first two numbers equal to third number: " + leftEqualToRight3);

    }
}
