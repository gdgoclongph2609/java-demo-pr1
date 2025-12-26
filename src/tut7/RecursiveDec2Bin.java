package tut7;
import java.util.*;

public class RecursiveDec2Bin {
    public static String decToBin(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return decToBin(n/2 ) + (n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <0 )
        {
            System.out.println("Binary: -" + decToBin(-n));
        } else {
            System.out.println("Binary: "+decToBin(n));
        }
    }

}
