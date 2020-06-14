// Code exercise 10 //
/*
The problem statement can be found under src/coding_exercises/MinutesToYersAndDaysCalculator/CodeExercise.txt
 */

package coding_exercises.MinutesToYearsAndDaysCalculator;

public class minutes_year_days_calculator {
    // Main method added here to test the code //
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
        public static void printYearsAndDays(long minutes){
            if (minutes < 0) {
                System.out.println("Invalid value");
            } else {
                long calculated_YEARS = minutes / 525600L;
                long remaining_minutes = minutes % 525600L;
                long remaining_days = remaining_minutes / 1440L;
                System.out.println(+minutes + " min = " + calculated_YEARS + " y and " + remaining_days + " d");
            }
        }
    }