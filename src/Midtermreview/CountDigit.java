package Midtermreview;
public class CountDigit {
    public static int countDigits(int n) {
        if (n ==0 ) {
            return 1;
        }
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println(countDigits(0));      // 1
        System.out.println(countDigits(-2));      // 1
        System.out.println(countDigits(15));     // 2
        System.out.println(countDigits(507));    // 3
        System.out.println(countDigits(-1234));  // 4
    }
}












