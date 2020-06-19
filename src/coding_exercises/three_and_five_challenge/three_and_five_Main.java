// Code exercise 16 //
/*
The problem statement can be found under src/coding_exercises/three_and_five_challenge/CodeExercise.txt
 */

package coding_exercises.three_and_five_challenge;

public class three_and_five_Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i=1; i<=1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Number " + i + " is divided by both 3 and 5");
            }
                if (count == 5) {
                    break;
                }
            }
        System.out.println("Sum = " + sum);
    }
}
