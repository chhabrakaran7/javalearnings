// Complete a challenge //

/*
1. Create a "double" variable with value 20.00
2. Create a second "double" variable with value 80.00
3. Add variables from "1" and "2" and multiply by 100.00
4. Find remainder of value from "3" and 40.00
5. Create "boolean" variable with value:
    ---> "true" if remainder from "4" is 0
    ---> "false" if remainder from "4" isn't 0
6. Output "boolean" variable
7. Print "Got some remainder" if "boolean" value from "5" is "false"
 */

package operator_operands_expressions;

public class challenge3 {
    public static void main(String[] args) {
        double myVar1 = 20.00d; // Step 1
        double myVar2 = 80.00d; // Step 2
        double totalVarValue = (myVar1 + myVar2) * 100.00d; // Step 3
        System.out.println("My values total = " + totalVarValue);
        double myRemainder = totalVarValue % 40.00d; // Step 4
        System.out.println("The remainder = " + myRemainder);
        boolean checkifZERO = (myRemainder == 0) ? true:false; // Step 5
        System.out.println("Any remainder value obtained: " + checkifZERO); // Step 6

        if(!checkifZERO) {
            System.out.println("Got some remainder"); // Step 7
        }
    }
}
