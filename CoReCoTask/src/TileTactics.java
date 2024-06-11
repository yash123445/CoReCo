import java.util.*;

public class TileTactics {
    public static void main(String[] args) {

        possibleBonus(3, 7);
        possibleBonus(1, 9);
        possibleBonus(5, 3);

    }

    public static void possibleBonus(int myTile, int friendTile) {
        if (Math.abs(myTile - friendTile) <= 5 && myTile < friendTile) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}