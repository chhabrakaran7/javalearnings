// Code exercise 5 //

/*
The problem statement can be found under src/coding_exercises/DecimalComparator/CodeExercise.txt
 */

package coding_exercises.DecimalComparator;

public class decimal_comparator {
    // Method //
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {
        boolean flag;

        int newval1 = (int) (value1 * 1000);
        System.out.println("newval1 = " + newval1);

        int newval2 = (int) (value2 * 1000);
        System.out.println("newval2 = " + newval2);

        if (newval1 == newval2) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
