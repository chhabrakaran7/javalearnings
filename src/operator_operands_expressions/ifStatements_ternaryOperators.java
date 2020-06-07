// Ternary Operators //

/*
1. Operator takes 3 operands.
2. It is a shortcut to "if-then-else" statement.
3. It is a shortcut to assign one of the 2 values to a variable depending upon the "condition".
 */
package operator_operands_expressions;

public class ifStatements_ternaryOperators {
    public static void main(String[] args) {
        // Example : Verify my age //
        int myAGE = 27;
        boolean ismyAGECorrect = ((myAGE == 27) && (myAGE > 18)) ? true:false;
        /* boolean VARIABLE = CONDITION ? <BOOLEAN VALUE>
         * Operand 1: "((myAGE == 27) && (myAGE > 18))" --> Also called CONDITION
         * Operand 2: "true"        --> value assigned to variable "ismyAGECorrect" if condition is true
         * Operand 3: "false"       --> value assigned to variable "ismyAGECorrect" if condition is false
         */
        System.out.println("My correct age is : " + myAGE);
        System.out.println("Is my age correct and above 18: " + ismyAGECorrect);
    }
}
