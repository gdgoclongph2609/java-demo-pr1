package Midtermreview;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        System.out.print("Enter score: ");
        int score = new Scanner(System.in).nextInt();

        if (score >=0 && score <=6){
            System.out.println("bronze");
        } else if (score >6 && score <=8){
            System.out.println("silver");

        } else if (score >8 && score <=10){
            System.out.println("gold");

        } else {
            System.out.println("Invalid score");
        }

    }
}
