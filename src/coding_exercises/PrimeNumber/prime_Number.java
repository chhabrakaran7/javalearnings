// Code exercise 15 //
/*
The problem statement can be found under src/coding_exercises/PrimeNumber/CodeExercise.txt
 */

package coding_exercises.PrimeNumber;

public class prime_Number {
    public static boolean isPrime(int n) {
        // A prime number is a natural number > 1 and is not the product of 2 smaller natural numbers//
        // Ex: 5 is PRIME as it can be obtained either by 1 X 5 or 5 X 1
        // Ex: 4 is NOT PRIME as it can be 2 X 2; which is product od 2 smaller natural number than 4
        // "n" is PRIME if "n" is multiple of any integer between 2 and SQRT (n)
        if (n == 1) {
            return false;
        }
        for(int i=2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
