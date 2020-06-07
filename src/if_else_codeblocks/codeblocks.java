// "if-then-else" and code blocks //

package if_else_codeblocks;

public class codeblocks {
    public static void main(String[] args) {
        // CODE BLOCK //
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 500;
        System.out.println("Your score: " + score);
        System.out.println("Number of levels completed: " + levelCompleted);
        System.out.println("Bonus per level:" + bonus);

        if(gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            System.out.println("The final score including bonus is: " + finalscore); // Game over
        } else if (levelCompleted < 10) {
            System.out.println("Hang on! The game ain't over yet. Not enough levels completed.");
            // Game not over and levels completed are not enough
        } else
            System.out.println("Game not over"); // Game not over
    }
}
