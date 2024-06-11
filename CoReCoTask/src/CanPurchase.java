import java.util.*;

public class CanPurchase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of 10 rupee notes:");
        int tenRupeeNotes = scanner.nextInt();
        System.out.println("Enter the number of 50 rupee notes:");
        int fiftyRupeeNotes = scanner.nextInt();
        System.out.println("Enter the number of 100 rupee notes:");
        int hundredRupeeNotes = scanner.nextInt();
        System.out.println("Enter the number of 200 rupee notes:");
        int twoHundredRupeeNotes = scanner.nextInt();
        System.out.println("Enter the price of the item:");
        int price = scanner.nextInt();

        int[] notes = {tenRupeeNotes, fiftyRupeeNotes, hundredRupeeNotes, twoHundredRupeeNotes};
        System.out.println(canPurchase(notes, price));
    }

    public static String canPurchase(int[] notes, int price) {
        int totalAmount = 0;
        totalAmount += notes[0] * 10;
        totalAmount += notes[1] * 50;
        totalAmount += notes[2] * 100;
        totalAmount += notes[3] * 200;

        if (totalAmount >= price) {
            return "You can purchase";
        } else {
            return "You need more money";
        }
    }
}
