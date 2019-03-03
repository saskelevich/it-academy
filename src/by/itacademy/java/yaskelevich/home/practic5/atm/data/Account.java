package by.itacademy.java.yaskelevich.home.practic5.atm.data;

import by.itacademy.java.yaskelevich.home.practic5.caunting.ICounting;

public class Account implements ICounting {

    private double balance;
    private String userName;

    public Account() {
        this.balance = Math.random() * 10000;
        this.userName = "User";
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(final double balance) {
//        this.balance = balance;
//    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    @Override
    public boolean add(final String value) {
        if (Double.parseDouble(value) >= 0) {
            this.balance += Double.parseDouble(value);
            return true;
        }
        return false;
    }

    @Override
    public boolean substract(final String value) {
        if (Double.parseDouble(value) >= 0) {
            this.balance -= Double.parseDouble(value);
            return true;
        }
        return false;
    }

}
