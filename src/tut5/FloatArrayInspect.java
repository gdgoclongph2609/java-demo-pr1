package tut5;
import java.util.Scanner;

public class FloatArrayInspect {
    public static double[] getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String line = sc.nextLine();

        String[] parts = line.split(" ");
        double[] n = new double[parts.length];

        for(int i = 0; i < parts.length; i++) {
            n[i] =Double.parseDouble(parts[i]);
        }


        return n;
    }
    public static double getAverage(double[] n){
        double sum = 0;
        for(int i = 0; i < n.length; i++){
            sum += n[i];

        }
        return sum/n.length;

    }
    public static double getMin(double[] n){
        double min = n[0];
        for(int i = 0; i < n.length; i++){
            if(n[i] < min){
                min = n[i];
            }
        }
        return min;

    }
    public static double getMax(double[] n) {
        double max = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        return max;
    }
    public static double getRange(double[] n){
        return getMax(n)-getMin(n);

    }

    public static void main(String[] args) {


        double[] numbers = getUserInput();

        double avg = getAverage(numbers);
        double min = getMin(numbers);
        double max = getMax(numbers);
        double range = getRange(numbers);

        System.out.println("Average = " + avg);
        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);
        System.out.println("Range = " + range);
    }




}
