// Main class //

package coding_exercises.barkingdog;

public class Main {
    public static void main(String[] args) {
        boolean barkingStatus = barking_dog.shouldWakeup(true, 1);
        System.out.println("barkingStatus = " + barkingStatus);
        boolean barkingStatus1 = barking_dog.shouldWakeup(false, 2);
        System.out.println("barkingStatus1 = " + barkingStatus1);
        boolean barkingStatus2 = barking_dog.shouldWakeup(true, 8);
        System.out.println("barkingStatus2 = " + barkingStatus2);
        boolean barkingStatus3 = barking_dog.shouldWakeup(true, -1);
        System.out.println("barkingStatus3 = " + barkingStatus3);
    }
}
