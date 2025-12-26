package Tut3;
import java.util.Scanner;

public class SavingsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How much money? ");
        double money = sc.nextDouble();

        System.out.print("How many years do you want to deposit your money? ");
        int years = sc.nextInt();

        System.out.print("What is the interest rate (%) ");
        double interest = sc.nextDouble();

        for  (int i = 1; i <= years; i++) {
            money = money + money * (interest / 100);

        }
        money = Math.round(money * 100.0) / 100.0;
        System.out.println("After " + years + ", you will receive " + String.format("%.2f", money));
    }
}
