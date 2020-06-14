// Code exercise 12 //
/*
The problem statement can be found under src/coding_exercises/PlayingCat/CodeExercise.txt
 */

package coding_exercises.PlayingCat;

public class playing_cat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean flag;
        if ((summer) && (temperature >= 25 && temperature <= 45)) {
            flag = true;
        } else if ((!summer) && (temperature >= 25 && temperature <= 35)) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}

