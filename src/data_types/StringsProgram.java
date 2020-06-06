// STRING Literal data type //

/*
1. String is a data type not a primitive type.
2. It is a sequence of characters.
3. Characters can be: numbers/UNICODES/text etc.
Format: String <variable> = "number/UNICODE/text"
 */

package data_types;

public class StringsProgram {
    public static void main(String[] args) {
        System.out.println("Fill in the blanks!");
        System.out.println("My _____ brother accidentally ____ over the ____ at ____ in the evening on ______");

        String adjective = "crazy";
        String verb = "ran";
        String noun = "flowers";
        String number = "8";
        String date = "6/6/2020";
        String symbol = "\uD83D\uDE02";

        System.out.println("My " + adjective + " brother accidentally " + verb + " over the " + noun + " at "
        + number + " in the evening on " + date + " " + symbol);

    }
}
