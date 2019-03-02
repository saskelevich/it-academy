package by.itacademy.java.yaskelevich.home.practic5.atm.account;

public class Account {
    private double balance;

    public Account() {
        balance = Math.random() * 1000;
    }

    public double getBalance() {
        return this.balance;
    }

    public void showBalance() {
        System.out.printf("%.2f", this.balance);
    }

    public void add(final double balance) {
        this.balance += balance;
    }

    public void substract(final double balance) {
        this.balance -= balance;
    }

    @Override
    public String toString() {
        return "" + this.balance + "";
    }
}
