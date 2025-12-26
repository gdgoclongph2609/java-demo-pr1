package tut6;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(117.25, 0.05, "Benson");
        BankAccount b = new BankAccount(-17.50, 0.05, "Mathew");
        System.out.println(a);
        System.out.println(b);

        a.transfer(b,10);
        System.out.println(a);
        System.out.println(b);

        a.deposit(117.25);
        System.out.println("deposit = tien gui cua : " + a);

        a.withdraw(20);
        System.out.println("withdraw = tien rut cua " + a);

        a.annualInterest();
        System.out.println("annualInterest = lai hang nam cua" + a);



    }
}
