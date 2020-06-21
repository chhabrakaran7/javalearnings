// Code exercise 17 //
/*
The problem statement can be found under src/coding_exercises/SumOdd/CodeExercise.txt
 */

package coding_exercises.SumOdd;

public class Sum_Odd {
    // Method 1 //
    public static boolean isOdd(int number) {
        if ((number % 2 == 0) || (number < 0)) {
            return false;
        } else {
            return true;
        }
    }

    // Method 2 //
    public static int sumOdd(int start, int end) {
        if ((end >= start) && (start > 0)) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else
            return -1;
    }
}