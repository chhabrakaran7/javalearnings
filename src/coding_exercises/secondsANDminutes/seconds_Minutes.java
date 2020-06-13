// Code exercise 8 //
/*
The problem statement can be found under src/coding_exercises/secondsANDminutes/CodeExercise.txt
 */

package coding_exercises.secondsANDminutes;

public class seconds_Minutes {
    // A final CONSTANT declared which can be used multiple times in the program //
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString (long minutes, long seconds){
        if ((minutes < 0 ) || (seconds < 0 || seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        } else {
            long hours = minutes / 60; // Calculate hours
            long remaining_minutes = minutes % 60; // Calculate remaining minutes

            // Append "0" to the hours/minutes/seconds if there value is < 10 //
            String hoursString = hours + "h";
            String minutesString = remaining_minutes + "m";
            String secondsString = seconds + "s";
            if (hours < 10){
                hoursString = "0" + hoursString;
            }
            if (remaining_minutes < 10){
                minutesString = "0" + remaining_minutes;
            }
            if (seconds < 10){
                secondsString = "0" + secondsString;
            }
            // Return value //
            return hoursString + " " + minutesString + " " + secondsString;
        }
    }

    public static String getDurationString (long seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        } else {
            long minutes = seconds / 60; // Calculate minutes
            long remaining_seconds = seconds % 60; // Calculate remaining seconds
            // Call the overloaded method //
            return getDurationString(minutes, remaining_seconds);
        }
    }
}


