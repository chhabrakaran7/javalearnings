// Methods //

/*
Methods:
1. Prevents code duplication by declaring the code once for reuse.
2. Methods are like functions in bash scripting.
3. Ex: public static void main(String[] args) ---> Here method is "main"
4. A user can create any number of methods and can call them in the "main" method.
 */

package methods;

public class method_concept {
// "main" method //
    public static void main(String[] args) {
        welcome();                    // Called "welcome" method
        addition(25, 25);        // Called "addition" method
        subtraction(100, 50);   // Called "subtraction" method
        multiply(5, 10);        // Called "multiply" method
        division(500, 10);      // Called "division" method

    }
    // Welcome method //
    public static void welcome() {
        System.out.println("Welcome to the method calculator!");
    }
    // Addition method //
    public static void addition(int a, int b) {
        System.out.println("The addition for the supplied numbers is: " + (a + b));
    }
    // Subtraction method //
    public static void subtraction(int a, int b) {
        System.out.println("The subtraction for the supplied numbers is: " + (a - b));
    }
    // Multiplication method //
    public static void multiply(int a, int b) {
        System.out.println("The multiplication for the supplied numbers is: " + (a * b));
    }
    // Division method //
    public static void division(int a, int b) {
        System.out.println("The division for the supplied numbers is: " + (a / b));
    }

}
