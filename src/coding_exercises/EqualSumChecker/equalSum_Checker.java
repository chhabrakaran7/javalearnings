// Code exercise 6 //

/*
The problem statement can be found under src/coding_exercises/EqualSumChecker/CodeExercise.txt
 */

package coding_exercises.EqualSumChecker;

public class equalSum_Checker {
    // Method//
    public static boolean hasEqualSum ( int value1, int value2, int value3) {
        int leftHandSide = value1 + value2;
        boolean flag;
        if (value3 == leftHandSide) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
