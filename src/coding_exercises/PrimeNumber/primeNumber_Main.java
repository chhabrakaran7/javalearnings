// Main class //

package coding_exercises.PrimeNumber;

public class primeNumber_Main {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1; i<50; i++) {
            if (prime_Number.isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
}
