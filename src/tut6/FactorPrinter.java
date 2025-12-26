package tut6;

public class FactorPrinter {
    public static void main(String[] args) {
        FactorGenerator a = new FactorGenerator(150);
        while (a.hasMoreFactor()){
            System.out.print(a.nextFactor() + " ");
        }
    }
}
