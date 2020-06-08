// Main class //

package coding_exercises.DecimalComparator;

public class decimal_Main {
    public static void main(String[] args) {
        boolean decimalPosition = decimal_comparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println("decimalPosition = " + decimalPosition);
        boolean decimalPosition1 = decimal_comparator.areEqualByThreeDecimalPlaces(3.1756, 3.176);
        System.out.println("decimalPosition1 = " + decimalPosition1);
        boolean decimalPosition2 = decimal_comparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println("decimalPosition2 = " + decimalPosition2);
        boolean decimalPosition3 = decimal_comparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println("decimalPosition3 = " + decimalPosition3);
                
    }
}
