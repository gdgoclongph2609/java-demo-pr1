package Tut2;
import java.util.Scanner;
import java.util.*;

public class floatingnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double a = sc.nextDouble();

        if (a ==0) {
            System.out.println("The number is zero.");
            return;


        }
        String result = "A";
        double absa = Math.abs(a);
        if (absa <1) {
            result  +=" small";

        } else if  (absa > 1000000.0){
            result  +=" large";

        }
        if (a >0) {
            result +=" positive";
        } else if (a <0)  {
            result +=" negative";
        }
        result += " number.";
        System.out.println("("+ a + ")" + " " + result);

        }
    }


