// Code exercise 7 //

/*
The problem statement can be found under src/coding_exercises/TeenNumberChecker/CodeExercise.txt
 */

package coding_exercises.TeenNumberChecker;

public class teenNumber_checker {
    // Method 1 //
    public static boolean hasTeen (int age1, int age2, int age3) {
        boolean flag = false; // Set flag default to false
        if (age1 >=13 && age1 <=19 ) {
            flag = true;
        }
        if (age2 >=13 && age2 <=19 ) {
            flag = true;
        }
        if (age3 >=13 && age3 <=19) {
            flag = true;
        }
        return flag;
    }
    // Method 2 //
    public static boolean isTeen (int age4) {
        boolean flag;
        if (age4 >=13 && age4 <=19) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
