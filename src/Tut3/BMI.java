package Tut3;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (kg): ");
        int weight = sc.nextInt();
        System.out.print("Enter your height (m): ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is:  " + String.format("%.2f",bmi)  + "(kg/m2)");

    }
}
