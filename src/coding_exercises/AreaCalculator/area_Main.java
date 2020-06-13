// Main class //

package coding_exercises.AreaCalculator;

public class area_Main {
    public static void main(String[] args) {
        // Area of circle //
        double circle_AREA = calculate_area.area(5.0);
        System.out.println("Area for the circle = " + circle_AREA);
        // Area of rectangle //
        double rectangle_AREA = calculate_area.area(5.0,4.0);
        System.out.println("Area of rectangle = " + rectangle_AREA);
    }
}
