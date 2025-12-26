package tut4;


public class AmstrongNumbers {
    public static void main(String[] args) {
        for (int i = 100; i <= 999 ; i ++){
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;

            int sum = a*a*a + b*b*b + c*c*c;

            if (sum == i) {
                System.out.println(i + " is ArmString number");
            }
        }
    }
}
