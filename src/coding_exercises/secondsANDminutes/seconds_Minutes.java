package coding_exercises.secondsANDminutes;

public class seconds_Minutes {
    public static String getDurationString (long minutes, long seconds){
        if ((minutes < 0 ) || (seconds < 0 || seconds > 59)){
            return "Invalid value";
        } else {
            long hours = minutes / 60; // Calculate hours
            long remaining_minutes = minutes % 60; // Calculate remaining minutes
            return hours + "h " + remaining_minutes + "m " + seconds + "s";
        }
    }

    public static String getDurationString (long seconds){
        if (seconds < 0){
            return "Invalid value";
        } else {
            long minutes = seconds / 60; // Calculate minutes
            long remaining_seconds = seconds % 60; // Calculate remaining seconds
            // Call the overloaded method //
            return getDurationString(minutes, remaining_seconds);
        }
    }
}


