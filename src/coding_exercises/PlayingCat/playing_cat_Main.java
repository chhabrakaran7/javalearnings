// Main class //

package coding_exercises.PlayingCat;

public class playing_cat_Main {
    public static void main(String[] args) {
        boolean status_of_cat = playing_cat.isCatPlaying(true, 10);
        System.out.println("status_of_cat = " + status_of_cat);
        boolean status_of_cat1 = playing_cat.isCatPlaying(false, 36);
        System.out.println("status_of_cat1 = " + status_of_cat1);
        boolean status_of_cat2 = playing_cat.isCatPlaying(false, 35);
        System.out.println("status_of_cat2 = " + status_of_cat2);
    }
}
