// Code exercise 2 //

/*
The problem statement can be found under src/coding_exercises/MegaBytesConverter/CodeExercise.txt
 */

package coding_exercises.barkingdog;

public class barking_dog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            barking = false;
        } else if ((barking) && (hourOfDay < 8 || hourOfDay > 22)) {
            barking = true;
        } else {
            barking = false;
        }
        return barking;
    }
}
