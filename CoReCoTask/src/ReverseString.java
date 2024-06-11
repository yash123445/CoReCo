import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = reverseString(str1);
        System.out.println(str2);
    }

    public static String reverseString(String str) {
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }
}