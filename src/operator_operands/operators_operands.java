// Operators and Operands //

/*
Examples of operators, operands and abbreviating operators
 */
package operator_operands;

public class operators_operands {
    public static void main(String[] args) {
        // addition operator //
        int result = 1 + 2;
        System.out.println("result = " + result); // result = 1 + 2
        // subtraction operator//
        result = result - 1;
        System.out.println("revised result = " + result); // revised result = 3 - 1
        // multiplication operator//
        result = result * 10;
        System.out.println("revised result = " + result); // revised result = 2 * 10
        // Division operator //
        result = result / 4;
        System.out.println("revised result = " + result); // revised result = 20 / 4
        // Modulus operator //
        result = result % 4;
        System.out.println("revised result = " + result); // revised result = 5 % 4

        /*Abbreviating operators*/
        // Single Addition //
        result ++;
        System.out.println("revised result = " + result); // revised result = 1 + 1
        // More than one addition //
        result += 8;
        System.out.println("revised result = " + result); // revised result = 2 + 8
        // Single subtraction //
        result--;
        System.out.println("revised result = " + result); // revised result = 10 - 1
        // More than one subtraction //
        result -= 4;
        System.out.println("revised result = " + result); // revised result = 9 - 4
        // Multiplication //
        result *= 10;
        System.out.println("revised result = " + result); // revised result = 5 * 10
        // Division //
        result /= 5;
        System.out.println("revised result = " + result); // revised result = 50 / 5
    }
}
