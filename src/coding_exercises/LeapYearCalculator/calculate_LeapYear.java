// Code exercise 4 //

/*
The problem statement can be found under src/coding_exercises/LeapYearCalculator/CodeExercise.txt
 */

package coding_exercises.LeapYearCalculator;

public class calculate_LeapYear {
    public static boolean isLeapYear(int year) {
        boolean flag;
        if (year <= 1 || year >= 9999) {            // year out of range [1-9999]
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
}

