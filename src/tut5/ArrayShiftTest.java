package tut5;


import java.util.Arrays;

public class ArrayShiftTest {
    public static String shiftArrayLeft(int[]a ) {
        if (a == null) {
            return null;
        }
        int temp = a[0];
        for (int i = 0 ; i < a.length -1 ; i++) {
            a[i] = a[i + 1];

        }
        a[a.length-1]  = temp;
        return Arrays.toString(a);

    }


    public static void main(String[] args) {
        int []a = {2,3,5,7,11,13};
        System.out.println(shiftArrayLeft(a));

    }
}
