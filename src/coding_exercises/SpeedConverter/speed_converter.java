// Code exercise 1 //
/*
The problem statement can be found under src/coding_exercises/SpeedConverter/CodeExercise.txt
 */

package coding_exercises.SpeedConverter;

public class speed_converter {
    // "toMilesPerHour" method //
    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0 ) {
            System.out.println("Invalid Value");
        } else {
            long convertedToMiles = toMilesPerHour(kilometersPerHour);
            System.out.println(+ kilometersPerHour + " km/h = " + convertedToMiles + " mi/h");
        }
    }
}
