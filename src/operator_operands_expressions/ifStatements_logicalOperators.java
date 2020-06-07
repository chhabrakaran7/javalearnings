// if-then statements //
// Logical Operators :: "AND", "OR" and "NOT" //

/*
1. "if-then" means if(VALUE) is true then execute the code block else don't.
2. The VALUE should always be a boolean value.
3. "if-then" statements should always have a code block.
i.e.
if(VALUE) {
---CODE BLOCK---
}

NOTE : If you don't include the {}, only the line of code next to "if-then" will be executed
 */
package operator_operands_expressions;

public class ifStatements_logicalOperators {
    public static void main(String[] args) {
        /*if-then statements*/
        // Example 1 : Basic "if-then" //
        boolean isAlien = false; // means there is no alien
        if (isAlien == false) {// if value of alien is false, execute code block
            System.out.println("Is alien present on earth :: " + isAlien);
            System.out.println("I'm very scared of Aliens.");
        }
        // Example 2 : "if-then" with "AND" operator //
        int topScore = 100;
        System.out.println("topScore = " + topScore);
        int secondTopScore = 80;
        System.out.println("secondTopScore = " + secondTopScore);
        if (topScore == 100) {
            System.out.println("You've got a high score of " + topScore); // Achieved top score
        }
        if ((topScore > secondTopScore) && (topScore < 200)) {
            System.out.println("Top score is greater than second top score AND top score is less than 200"); // 100 > 80 AND 100 < 200
        }
        // Example 3 : "if-then" with "OR" operator //
        if ((topScore > secondTopScore) || (secondTopScore > 60)) {
            System.out.println("Top score is greater than second top score OR second top score is greater than 60"); // 100 > 80 OR 80 >60
        }
        // Example 4 : "if-then" with "NOT" operator //
        if (!isAlien) {
            System.out.println("Hey there is no alien on earth"); // Check if value of "isAlien" boolean operator == "false
        }
        if (topScore != 200) {
            System.out.println("The top score is not equal to 200 instead it is :: " + topScore);
        }

    }
}
