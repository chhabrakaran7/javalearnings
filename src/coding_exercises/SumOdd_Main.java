// Main class //

package coding_exercises;

public class SumOdd_Main {
    public static void main(String[] args) {
        // Validate : Supplied number is Odd or not //
        boolean validateNumber = Sum_Odd.isOdd(5);
        System.out.println("Is the number Odd = " + validateNumber);
        // Validate the problem statement by printing the sum //
        int printSum = Sum_Odd.sumOdd(100, 100);
        System.out.println("Validate sum = " + printSum);
        
    }
}
