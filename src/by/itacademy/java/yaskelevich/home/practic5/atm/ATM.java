package by.itacademy.java.yaskelevich.home.practic5.atm;

import java.util.ArrayList;

import by.itacademy.java.yaskelevich.home.practic5.atm.account.Account;
import by.itacademy.java.yaskelevich.home.practic5.atm.action.Input;
import by.itacademy.java.yaskelevich.home.practic5.atm.action.Output;
import by.itacademy.java.yaskelevich.home.practic5.atm.cell.Cell;

public class ATM {
    private ArrayList<Cell> cell;
    private Account account;
    private final Input in;
    private final Output out;

    public ATM() {
        this.cell = new ArrayList<Cell>();
        this.account = new Account();
        in = new Input(account, cell);
        out = new Output(account, cell);
    }

    public ArrayList<Cell> getCell() {
        return cell;
    }

    public void setCell(final ArrayList<Cell> cell) {
        this.cell = cell;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(final Account account) {
        this.account = account;
    }

    public void add(final String cash) {
        System.out.println("In: ");
        in.add(cash);
    }

    public void substract(final String cash) {
        System.out.println("Out");
        out.substract(cash);
    }

    public void showBalance() {
        System.out.print("\nBalance = ");
        account.showBalance();
        System.out.println();
    }
}
