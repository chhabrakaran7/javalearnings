// Code exercise 21 //
/*
The problem statement can be found under src/coding_exercises/EvenDigitSum/CodeExercise.txt
 */

package coding_exercises.EvenDigitSum;

public class evenDigitSum {
    public static int getEvenDigitSum(int number){
        int sum = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number != 0){
                int digit = number % 10;
                if (digit % 2 == 0){
                    sum += digit;
                }
                number /= 10;
            }
        }
        return sum;
    }
}
