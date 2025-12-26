package tut5;
import java.util.Scanner;

public class DecToBin {
    public static String toBinary(int n) {
        if  (n == 0) {
            return "0";
        }
        String binary = "";
        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }
        return binary;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String binary = toBinary(n);
        System.out.println(binary);
    }


}
