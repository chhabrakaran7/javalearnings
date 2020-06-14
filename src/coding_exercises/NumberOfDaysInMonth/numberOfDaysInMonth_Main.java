// Main class //

package coding_exercises.NumberOfDaysInMonth;

public class numberOfDaysInMonth_Main {
    public static void main(String[] args) {
        // Method 1: Check if the year passed is a leap year //
        boolean Is_leapYear = numberOfDaysInMonth.isLeapYear(-1600);
        System.out.println("Is_leapYear = " + Is_leapYear);
        boolean Is_leapYear1 = numberOfDaysInMonth.isLeapYear(1600);
        System.out.println("Is_leapYear1 = " + Is_leapYear1);
        boolean Is_leapYear2 = numberOfDaysInMonth.isLeapYear(2017);
        System.out.println("Is_leapYear2 = " + Is_leapYear2);

        // Method 2: Display number of days in month and validate leap year wherever necessary //
        int daysInMonth = numberOfDaysInMonth.getDaysInMonth(1,2020);
        System.out.println("daysInMonth = " + daysInMonth);
        int daysInMonth1 = numberOfDaysInMonth.getDaysInMonth(2,2020);
        System.out.println("daysInMonth1 = " + daysInMonth1);
        int daysInMonth2 = numberOfDaysInMonth.getDaysInMonth(2,2018);
        System.out.println("daysInMonth2 = " + daysInMonth2);
        int daysInMonth3 = numberOfDaysInMonth.getDaysInMonth(-1,2020);
        System.out.println("daysInMonth3 = " + daysInMonth3);
        int daysInMonth4 = numberOfDaysInMonth.getDaysInMonth(1,-2020);
        System.out.println("daysInMonth4 = " + daysInMonth4);
    }
}
