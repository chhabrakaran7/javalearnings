// Code exercise 11 //
/*
The problem statement can be found under src/coding_exercises/EqualityPrinter/CodeExercise.txt
 */

package coding_exercises.EqualityPrinter;

public class equality_printer {
    // Called the main method to test the code //
    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1, 1, 2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }
    // Method //
    public static void printEqual(int firstnumber, int secondnumber, int thirdnumber){
        if (firstnumber < 0 || secondnumber < 0 || thirdnumber < 0){
            System.out.println("Invalid Value");
        } else if ((firstnumber == thirdnumber) && (secondnumber == thirdnumber)){
            System.out.println("All numbers are equal");
        } else if ((firstnumber != thirdnumber) && (firstnumber != secondnumber) && (secondnumber != thirdnumber)){
            System.out.println("All numbers are different");
        } else{
            System.out.println("Neither all are equal or different");
        }
    }
}
