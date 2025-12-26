package Tut2;
import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age ? ");
        int age = sc.nextInt();

        if (age < 13 ) {
            System.out.println("You are still a kid.");
        } else if ( 13 <= age && age <= 19) {
            System.out.println("Welcome, teenager");
        } else if (age > 19) {
            System.out.println("You are too old");
        }

    }

}
