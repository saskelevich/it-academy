package by.itacademy.java.yaskelevich.home.practic5.bancomat.account;

//добавить считалку вывода
import java.util.Random;

public class Account {
    private double balance;
    private final Random rand = new Random();

    public Account() {
        this.balance = rand.nextDouble() * 10000;
    }

    public double getBalance() {
        return this.balance;
    }

    public double inPut(final double balance) {
        this.balance += balance;
        return getBalance();
    }

    public double outPut(final double balance) {
        this.balance -= balance;
        return getBalance();
    }

    @Override
    public String toString() {
        return "" + this.balance + "";
    }
}
