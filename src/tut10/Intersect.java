package tut10;
import java.util.*;

public class Intersect {
    public static Set<Integer> intersect(Set<Integer> A, Set<Integer> B) {




        Set<Integer> C = new HashSet<>();
        if (A.size() > B.size()) {
            Set<Integer> temp = A;
            A = B;
            B = temp;

        }
        for ( int x : A) {
            if (B.contains(x)) {
                C.add(x);

            }
        }
        return C;




    }
    public static void main(String[] args) {
        Set<Integer> A1 = new HashSet<>();
        Set<Integer> B1 = new HashSet<>();

        A1.add(1);
        A1.add(2);
        A1.add(3);

        B1.add(2);
        B1.add(3);
        B1.add(4);

        Set<Integer> C = intersect(A1, B1);
        System.out.println(C);
    }


}
