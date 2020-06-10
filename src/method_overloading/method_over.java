// Method overloading with a use case //
/*
Method Overloading: Using the same method name with different parameters.
Note:
Overloading is only possible when parameters are different.
 */

package method_overloading;

public class method_over {
    // Method 1 //
    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if ((feet >= 0) || (inches >= 0 && inches <= 12)) {
            /* Convert feet and inches to centimeter
             * 1 Inch = 2.54 cm and 1 foot = 12 inches
             */
           double cal_inch = (12 * feet) + inches;
           double cal_centimeter = 2.54 * cal_inch;
           return cal_centimeter;
        } else {
            return -1;
        }

    }
    // Method 2 : Method Overloading //
    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches >= 0) {
            double cal_feet = inches / 12;
            return cal_feet;
        } else {
            return -1;
        }
    }
}
