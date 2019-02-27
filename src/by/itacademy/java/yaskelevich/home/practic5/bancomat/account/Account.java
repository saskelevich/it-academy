package by.itacademy.java.yaskelevich.home.practic5.bancomat.account;

public class Account {
    private static double balance = Math.random() * 1000;

    public Account() {
    }

    public double getBalance() {
        return Account.balance;
    }

    public double inPut(final double balance) {
        Account.balance += balance;
        return getBalance();
    }

    public double outPut(final double balance) {
        Account.balance -= balance;
        return getBalance();
    }

    @Override
    public String toString() {
        return "" + Account.balance + "";
    }
}
