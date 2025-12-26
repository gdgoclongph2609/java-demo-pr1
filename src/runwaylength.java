import java.util.Scanner;

public class runwaylength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter speed and acceleration: ");
        double  speed = sc.nextDouble();
        double  acceleration = sc.nextDouble();


        double runwaylength = (Math.pow(speed,2) / (2 *acceleration));
        System.out.println("Runway length: " + runwaylength);






    }
}
