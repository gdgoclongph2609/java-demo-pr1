package tut1;

public class CoinConverter {
    public static void main(String[] args) {
        int totalXu = 483274;
        int quan = totalXu / 10000;
        int remaining = totalXu % 10000;

        int dong = remaining / 100;
        remaining = remaining % 100;

        int hao = remaining / 10;
        remaining = remaining % 10;


        System.out.println(totalXu + " xu converts into: ");
        System.out.println(quan + " quan, " + dong + " dong, " + hao + " hao, " + remaining + " xu." );




    }
}
