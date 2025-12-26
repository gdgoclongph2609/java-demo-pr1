package tut4;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        int next = a + b;

        while (next < limit) {
            System.out.print( next + " ");

            a = b;
            b = next;
            next = a + b;

        }


    }
}
