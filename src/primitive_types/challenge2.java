// Complete a challenge //

/* The challenge is to:
1. Create a variable with a type to store the number of POUNDS to be converted to KGs.
2. Calculate number of KGs based on contents of variable in "1" and store in a second variable.
3. Result.
HINT: 1 POUND = 0.45359237 KG
 */

package primitive_types;

public class challenge2 {
    public static void main(String[] args) {
        int weight_in_pounds = 200;
        double single_pound_value = 0.45359237;
        double weight_in_kgs = weight_in_pounds * single_pound_value;
        System.out.println("The weight in pounds :: " + weight_in_pounds);
        System.out.println("A pound equals to " + single_pound_value + " Kilograms");
        System.out.println("The weight is kilograms for " + weight_in_pounds + " pounds is :: " + weight_in_kgs);
    }
}
