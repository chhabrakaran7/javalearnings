/*PRIMITIVE Types : FLOAT and DOUBLE*/

/*
1. FLOAT: Single precision number (32 bits)
2. DOUBLE: Double precision number (64 bits)
* PRECISION: format and amount of space occupied
* "double" primitive type is mostly used as compared to float as it has better precision so,
* moving forward we'll be using double for better precision.
 */


package primitive_types;

public class precision_floatingNums {
    public static void main(String[] args) {
        // "float" primitive type //
        float minFloatNumber = Float.MIN_VALUE;
        float maxFloatNumber = Float.MAX_VALUE;
        System.out.println("The minumum float value in JAVA :: " + minFloatNumber);
        System.out.println("The maximum float value in JAVA :: " + maxFloatNumber);
        
        // "double" primitive type //
        double minDoubleNumber = Double.MIN_VALUE;
        double maxDoubleNumber = Double.MAX_VALUE;
        System.out.println("The minumum double value in JAVA :: " + minDoubleNumber);
        System.out.println("The maximum double value in JAVA :: " + maxDoubleNumber);

        // Comparison //
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("Integer value :: " + myIntValue);
        System.out.println("Float value :: " + myFloatValue);
        System.out.println("Double value :: " + myDoubleValue);
    }
}
