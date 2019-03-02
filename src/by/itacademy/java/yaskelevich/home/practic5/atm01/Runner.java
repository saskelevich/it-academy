package by.itacademy.java.yaskelevich.home.practic5.atm01;

import by.itacademy.java.yaskelevich.home.practic5.atm01.atm.ATM;

public class Runner {
    public static void main(final String[] args) {
        final ATM atm = new ATM();

        System.out.println(atm.getAccount().getBalance());

        System.out.println("In: ");
        System.out.println(atm.add());
        System.out.println(atm.getAccount().getBalance());

        System.out.println("Out: ");
        System.out.println(atm.substract());
        System.out.println(atm.getAccount().getBalance());
    }
}
