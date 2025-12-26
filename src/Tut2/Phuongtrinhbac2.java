package Tut2;
import java.util.Scanner;

public class Phuongtrinhbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a: ");
        double a = sc.nextDouble();

        System.out.print("Please enter b: ");
        double b = sc.nextDouble();

        System.out.print("Please enter c: ");
        double c = sc.nextDouble();

        double denta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0 && b == 0 && c == 0){
            System.out.println("There are nothing to be solved");

        } else if (a == 0 && b == 0 && c != 0){
            System.out.println("There are no root");

        } else if ( a == 0 ){
            double x = -c / b;
            System.out.println("There is one root x = " + x );
        } else if ( denta < 0){
            System.out.println("The equation has no roots");

        } else if (denta == 0) {
            double x =  -b/ (2*a);
            System.out.println("The equation has one roots");
            System.out.println("x1 = " + x );
        }

        else {
            double x1 = (-b + Math.sqrt(denta)) / (2 * a) ;

            double x2 = (-b - Math.sqrt(denta)) / (2 * a) ;
            System.out.println("The equation has two roots ");
            System.out.println("x1 = " + x1 +", x2 = " + x2);

        }




    }
}
