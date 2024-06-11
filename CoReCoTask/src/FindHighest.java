import java.util.*;

public class FindHighest{

    public static void main(String[] args) {
        int[] arr = {-1, 3, 5, 6, 99, 12, 2};
        System.out.println(findHighest(arr));
        int [] arr1={6,7,8};
        System.out.println(findHighest(arr1));
        }

        public static int findHighest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
        max = arr[i];
            }
        }
        return max;
    }
}
