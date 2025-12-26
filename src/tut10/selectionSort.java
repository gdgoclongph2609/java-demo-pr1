package tut10;

import java.util.Arrays;

public class selectionSort {

    public static int[] selectionSort(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int p = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[p]) {
                    p = j;
                }
            }
            B[i] = A[p];
            A[p] = A[i];
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = { 5, 4, 7, 2, 9 };
        int[] B = selectionSort(A);
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
