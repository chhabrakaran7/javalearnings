// Code exercise 18 //
/*
The problem statement can be found under src/coding_exercises/DigitSumChallenge/CodeExercise.txt
 */

package coding_exercises.DigitSumChallenge;

public class digit_sum_challenge {
    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }

        int sum = 0;
        while (number > 0){
            // we have to divide by 10 until possible which is why the while loop should execute until it is > 0
            int digit = number % 10; // extract the least significant digit
            sum += digit;

            // drop least significant digit
            number /= 10; // same as number = number / 10
        }
        return sum;
    }
}
