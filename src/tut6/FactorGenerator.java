package tut6;

public class FactorGenerator {
    int number;
    int factor;
    public FactorGenerator(int numberToFactor) {
        this.number = numberToFactor;
        this.factor = 2;
    }
    public boolean hasMoreFactor() {
        return number > 1;
    }
    public int nextFactor(){
        while (number % factor != 0){
            factor++;

        }
        number = number / factor;
        return factor;


    }
}
