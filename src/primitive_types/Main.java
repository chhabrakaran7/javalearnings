/* PACKAGES, PRIMITIVE TYPES, WRAPPER CLASS
 * Create project from template with a package name.
 * Creating project with package creates:
 * 1. parent directory with the package name.
 * 2. A main class with method and code block.
 * WRAPPER Class :: A class defined by java to perform all functions associated with the primitive type.
 * CASTING :: Casting is important as java treats the Right Hand Side value as integer by default
 * */

package primitive_types;

public class Main {

    public static void main(String[] args) {
        // "int" primitive type //
        int myvalue = 1000;
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("The minuimum integer value in JAVA :: " + minIntValue);
        System.out.println("The maximum integer value in JAVA :: " + maxIntValue);

        // "byte" primitive type //
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("The minumum byte value in JAVA :: " + minByteValue);
        System.out.println("The maximum byte value in JAVA :: " + maxByteValue);

        // "short" primitive type //
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("The minumum short value in JAVA :: " + minShortValue);
        System.out.println("The maximum short value in JAVA :: " + maxShortValue);

        // "long" primitive type //
        // Syntax :: long myLongValue = 100L //
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("The minumum long value in JAVA :: " + minLongValue);
        System.out.println("The maximum long value in JAVA :: " + maxLongValue);

        /* CASTING :: Telling java to process primitive types other then "int"
         * Casting is important as java treats the Right Hand Side value as integer by default
         * Every programming language has a way of casting
         */
        int myinttotal = (minIntValue / 2);
        byte mybytetotal = (byte) (minByteValue / 2);
        short myshorttotal = (short) (minShortValue / 2);
        System.out.println("Testing CASTING for integer :: " + myinttotal);
        System.out.println("Testing CASTING for byte :: " + mybytetotal);
        System.out.println("Testing CASTING for short :: " + myshorttotal);
    }
}
