// "switch" statement //
/*
1. A switch statement is used as an alternative of "if then else-if" statement.
2. A switch statement can be used only to test "ONE VARIABLE VALUE".
3. "break" is used to exit out of the "switch" statement.
4. The "VARIABLE VALUE" passed to the switch statement is case sensitive.
 */

package ControlFlowStatements.SwitchStatement;

public class switch_Main {
    public static void main(String[] args) {
        int switchValue = 6;
        // Syntax: switch(VARIABLE_TO_TEST) //
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
                // Redundant cases //
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Actually the value was " + switchValue);
                break;
            default:
                System.out.println("Was neither 1,2,3,4 or 5");
                System.out.println("The actual value was " + switchValue);
                break;
        }
    }
}
