package coding_exercises.secondsANDminutes;

public class seconds_minutes_main {
    public static void main(String[] args) {
        String hours = seconds_Minutes.getDurationString(65L, 45L);
        System.out.println("hours = " + hours);
        String validate_hours = seconds_Minutes.getDurationString(3945L);
        System.out.println("validate_hours = " + validate_hours);
    }
}
