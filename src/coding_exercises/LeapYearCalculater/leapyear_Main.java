// Main Class //

package coding_exercises.LeapYearCalculater;

public class leapyear_Main {
    public static void main(String[] args) {
        boolean isLeapYear = calculate_LeapYear.isLeapYear(2017);
        System.out.println("isLeapYear = " + isLeapYear);
        boolean isLeapYear1 = calculate_LeapYear.isLeapYear(1600);
        System.out.println("isLeapYear1 = " + isLeapYear1);
        boolean isLeapYear2 = calculate_LeapYear.isLeapYear(2200);
        System.out.println("isLeapYear2 = " + isLeapYear2);
        boolean isLeapYear3 = calculate_LeapYear.isLeapYear(2400);
        System.out.println("isLeapYear3 = " + isLeapYear3);
    }
}
