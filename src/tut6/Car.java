package tut6;

public class Car {
    double fuel;
    double fuelEfficiency;
    public Car (double Efficiency){
        this.fuelEfficiency =  Efficiency;
        this.fuel = 0;

    }
    public void addFuel (double amount){
        this.fuel += amount;
    }
    public void drive (double distance) {
        double fuelUsed = distance / fuelEfficiency;
        this.fuel -= fuelUsed;
        System.out.println("fuel used = " + fuelUsed);

    }
    public double getGasInTank() {
        return this.fuel;
    }

}
