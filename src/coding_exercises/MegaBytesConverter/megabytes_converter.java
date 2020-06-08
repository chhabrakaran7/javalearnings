// Code exercise 2 //

/*
The problem statement can be found under src/coding_exercises/MegaBytesConverter/CodeExercise.txt
 */

package coding_exercises.MegaBytesConverter;

public class megabytes_converter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        int calculatedMBs = kiloBytes / 1024;
        int calculatedKBs = kiloBytes % 1024;
        if ( kiloBytes < 0 ) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(+ kiloBytes + " KB = " + calculatedMBs + " MB and " + calculatedKBs + " KB");
        }
    }
}
