// Main Class //

package coding_exercises.TeenNumberChecker;

public class teenNumber_Main {
    public static void main(String[] args) {
        // Method 1 outputs //
        boolean status = teenNumber_checker.hasTeen(24, 23, 24);
        System.out.println("Status from method1 = " + status);
        boolean status1 = teenNumber_checker.hasTeen(24, 13, 24);
        System.out.println("Status from method1 = " + status1);
        // Method 2 outputs //
        boolean status2 = teenNumber_checker.isTeen(15);
        System.out.println("Status from method1 = " + status2);
        boolean status3 = teenNumber_checker.isTeen(24);
        System.out.println("Status from method1 = " + status3);
    }
}
