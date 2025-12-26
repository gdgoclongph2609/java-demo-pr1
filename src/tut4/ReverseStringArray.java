package tut4;

public class ReverseStringArray {
    public static void main(String[] args) {

        String[] s = {"Pham", " Hoang" , " Long"};

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        for (int i = 0; i < s.length ; i++) {
            System.out.println(s[i]);
        }


    }
}
