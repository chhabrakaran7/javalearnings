// Code exercise 20 //
/*
The problem statement can be found under src/coding_exercises/FirstAndLastDigitSum/CodeExercise.txt
 */

package coding_exercises.FirstAndLastDigitSum;

public class firstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int firstdigit = 0;
        if (number < 0) {
            return -1;
        } else {
            // Last digit = number % 10 //
            int lastdigit = number % 10;
            // First digit = Divide the number with 10 until number > 10 //
            while (number >= 10) {
                number /= 10;
                System.out.println("number = " + number);
            }
            firstdigit = number;
            sum = firstdigit + lastdigit;
            return sum;
        }
    }
}





