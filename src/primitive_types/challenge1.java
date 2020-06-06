//Complete a challenge //

/* The challenge is to:
1. Create a byte variable and set it to a valid byte number.
2. Create a short variable and set it to any valid short number.
3. Create a int variable and set it to valid int number.
4. Create a long variable type and make it equal to 50000 + 10 (byte + short + int) variabes.
 */

package primitive_types;

public class challenge1 {

    public static void main(String[] args) {
        int myintegervalue = 1000;
        short myshortvalue = 50;
        byte mybytevalue = 35;
        long mylongvalue = 50000L + 10L * (mybytevalue + myintegervalue + myshortvalue);
        System.out.println("The long value obtained from the challenge is :: " + mylongvalue);
    }

}
