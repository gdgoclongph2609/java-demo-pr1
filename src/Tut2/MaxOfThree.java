package Tut2;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = 2;

        int max = Math.max(a, Math.max(b, c));

        System.out.println("Among " + a + ", " + b + " and " + c + ", the largest is " + max + ".");
    }
}
