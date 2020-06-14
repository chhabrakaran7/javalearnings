// Code exercise 14 //
/*
The problem statement can be found under src/coding_exercises/NumberOfDaysInMonth/CodeExercise.txt
 */

package coding_exercises.NumberOfDaysInMonth;

public class numberOfDaysInMonth {
    // Method 1: Check if it is a leap year //
    public static boolean isLeapYear(int year) {
        boolean flag;
        if (year < 1 || year > 9999) {            // year out of range [1-9999]
            flag = false;
        } else {
            // Check if divisible by 4 //
            if (year % 4 == 0) {
                flag = true;
                // Check if divisible by 100 //
                if (year % 100 == 0) {
                    // Check if divisible by 100 and 400 //
                    if (year % 400 == 0) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                } else {
                    flag = true;
                }
            } else {
                flag = false;
            }
        }
        return flag;
    }

    // Method 2: Get days in the supplied month, keep in mind validation of leap year //
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            int days;
            if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
                days = 31;
                return days;
            } else if (month == 2) {
                boolean leapYear_status = isLeapYear(year);
                if (leapYear_status) {
                    days = 29;
                } else {
                    days = 28;
                }
                return days;
            } else {
                days = 30;
                return days;
            }
        }
    }
}