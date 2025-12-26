package tut7;
import java.util.*;

public class RecursiveStringReverse {
    public static String reverseString(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return reverseString(s.substring(1))+ s.charAt(0);



    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print(reverseString(s));

    }

}
