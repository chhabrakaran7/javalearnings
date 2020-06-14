package ControlFlowStatements.SwitchStatement;

public class challenge_switch {
    public static void main(String[] args) {
        char switchValue = 'F';
        // Syntax: switch(VARIABLE_TO_TEST) //
        switch (switchValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            case 'E':
                System.out.println("Value was E");
                break;
            default:
                System.out.println("Was neither A,B,C,D or E");
                System.out.println("The actual value was " + switchValue);
                break;
        }
    }
}
