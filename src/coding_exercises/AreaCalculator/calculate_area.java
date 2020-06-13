// Code exercise 9 //
/*
The problem statement can be found under src/coding_exercises/AreaCalculator/CodeExercise.txt
 */

package coding_exercises.AreaCalculator;

public class calculate_area {
    // Method 1 //
    public static double area (double radius){
        if (radius < 0){
            return -1.0;
        } else {
            double circle_area = Math.PI * Math.pow(radius, 2);
            return circle_area;
        }
    }
    // Method 2 //
    public static double area (double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        } else {
            double rectangle_area = x * y;
            return rectangle_area;
        }
    }
}
