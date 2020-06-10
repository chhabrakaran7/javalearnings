// Main Class //

package method_overloading;

public class overload_Main {
    public static void main(String[] args) {
        double result_CM = method_over.calcFeetAndInchesToCentimeters(5, 13);
        System.out.println("result_CM = " + result_CM);
        
        double result_FEET = method_over.calcFeetAndInchesToCentimeters(178);
        System.out.println("result_FEET = " + result_FEET);
    }
}
