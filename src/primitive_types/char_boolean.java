// CHAR and Boolean primitive types //

/*
* char:
1. "char" can store only one character.
2. "char" allows user to store UNICODE characters.
3. UNICODE is encoding standard where each "letter/digit/symbol" is assigned a unique number value.
4. Total UNICODE characters :: 65535

* boolean:
1. A boolean value gives only 2 choices: true/1 or false/0
 */


package primitive_types;

public class char_boolean {
    public static void main(String[] args) {
        // "char" primitive type //
        char myUNICODE1 = '\u004B';
        char myUNICODE2 = '\u0041';
        char myUNICODE3 = '\u0052';
        char myUNICODE4 = '\u0041';
        char myUNICODE5 = '\u004E';
        // Ex: Print First name //
        System.out.println("The character for the supplied UNICODE is :: " + myUNICODE1 + myUNICODE2 + myUNICODE3
                + myUNICODE4 + myUNICODE5 );

        // "boolean" primitive type //
        // Ex: Count the doors //
        boolean passedDoors = true;
        boolean missedDoors = false;
        boolean passedAllDoors = false;
        int targetDoors = 3;
        int doorCount = 0;

        // First Door passed //
        if(passedDoors) {
            System.out.println("We passed the first door!");
            doorCount = doorCount + 1;
        }
        // Second Door passed //
        if(passedDoors) {
            System.out.println("We passed the second door!");
            doorCount = doorCount +1;
        }
        // Third Door passed //
        if(passedDoors) {
            System.out.println("We passed the final door!");
            doorCount = doorCount + 1;
        }
        /*Validate door count with the target door count
         * If door count meets target door count
         * ---> Set value for "passedAllDoors = true"
         * Else
         * ---> Print FAILURE message!
         */
        if(doorCount == targetDoors) {
            passedAllDoors = true;
            if (passedAllDoors) {
                System.out.println("Congratulations you've passed all " + doorCount + " doors");
            }
            else {
                System.out.println("SORRY, you haven't croosed all doors");
            }
        }
    }
}
