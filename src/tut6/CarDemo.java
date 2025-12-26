package tut6;

public class CarDemo {
    public static void main(String[] args) {
        Car bugati = new Car(50);

        bugati.addFuel(100);
        System.out.println("addFuel = do so luong lit xang vao xe la " + bugati.fuel);

        bugati.drive(100);

        bugati.getGasInTank();
        System.out.println("getGasInTank = so lit xang con lai la " + bugati.getGasInTank());
    }
}
