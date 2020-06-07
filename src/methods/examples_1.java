// Example for method usage //
/*
* Code being reused from src/if_else_codeblocks/codeblocks.java
* Reuse the above mentioned code to create and use methods
*/

package methods;

public class examples_1 {
    public static void main(String[] args) {
        // CODE BLOCK //
        int score1 = gameStatus(true, 5000, 5, 500);
        System.out.println("The final score for yourself including bonus is: " + score1); // "finalscore" value returns from "gameStatus" method
        int errorStatus = gameStatus(false, 5000, 5, 500); // "ERROR" returns from the "gameStatus" method
        if (errorStatus == -1) {
            System.out.println("Game isn't over yet, keep playing!!!");
        }
    }

    // gameStatus method //
    public static int gameStatus(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            return finalscore; // return the "final score value to the "main" method
        } else {
            return -1; // return "-1" which means ERROR in java to main method
        }
    }
}

