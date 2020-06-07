// Complete the challenge //

/*

* Create a method "displayHighScorePosition"
1. This method should:
    > take 2 parameters as "player's name" and "position"
    > display "player's name" along-with a message like "<player name> secured this <position>

* Create a second method "calculateHighScorePosition"
1. This method should:
    > send only 1 argument.
    > return an integer value.
    > the return data should be:
        --> "1" if score >= 1000
        --> "2" if 1000 > score >= 500
        --> "3" if 500 > score >= 100
        --> "4" in rest of the cases
    > Print results for 1500, 900, 400 and 50

* Call both methods and display the results :
*/

package methods;

public class challenge4 {
    public static void main(String[] args) {

        int position; // Initialize a variable

        position = calculateHighScorePosition(1500); // Returns "1" from the "calculateHighScorePosition" function.
        displayHighScorePosition("Karan", position);
        position = calculateHighScorePosition(900);  // Returns "2" from the "calculateHighScorePosition" function.
        displayHighScorePosition("Anders", position);
        position = calculateHighScorePosition(400);  // Returns "3" from the "calculateHighScorePosition" function.
        displayHighScorePosition("Michael", position);
        position = calculateHighScorePosition(50);   // Returns "4" from the "calculateHighScorePosition" function.
        displayHighScorePosition("Andrew", position);
    }
    // calculateHighScorePosition method //
    public static int calculateHighScorePosition(int score) {
        int rank; // initialize rank
        if ( score >= 1000) {
            rank = 1;
        } else if (score >= 500) {
            rank = 2;
        } else if (score >= 100) {
            rank = 3;
        } else {
            rank = 4;
        }

        return rank; // return the "rank" value obtained from the above if-then-elseif statements
    }
    // displayHighScorePosition method //
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get " + position + " position on the high score table.");
    }
}
