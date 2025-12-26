package tut6;
public class BankAccount {
    double interestRate;
    double balance;
    int transactions;
    String holderName;
    public BankAccount(double initial,double rate , String HolderName) {
        this.balance = initial;
        this.transactions = 1;
        this.interestRate = rate;
        this.holderName = HolderName;
    }
    public void annualInterest() {
        balance += balance * interestRate;

    }
    @Override
    public String toString() {
        if (balance < 0) {
            return holderName + ", -$" + String.format("%.2f", Math.abs(balance));
        } else {
            return holderName + ", $" + String.format("%.2f", balance);
        }
    }
    public void transfer(BankAccount other, double amount) {
        double fee = 0.5;
        if (this.balance >= amount + fee) {
            this.withdraw(amount+ fee);
            other.deposit(amount);

        } else {
            System.out.println("Not enough money");
        }
    }


    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions++;
    }

    public void monthlyFee() {
        this.withdraw(10);
    }
}



