package by.itacademy.java.yaskelevich.home.practic5.atm.action;

import java.util.ArrayList;

import by.itacademy.java.yaskelevich.home.practic5.atm.account.Account;
import by.itacademy.java.yaskelevich.home.practic5.atm.cell.Cell;

public class Action {
    protected final static int[] CELL_NUMBERS = {50, 20, 10};
    protected Account account;
    protected ArrayList<Cell> cell;

    public Action() {
    }

    public Action(final Account account, final ArrayList<Cell> cell) {
        this.cell = cell;
        this.account = account;
        initial();
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

    private void initial() {
        for (final int string : CELL_NUMBERS) {
            this.cell.add(new Cell(0, string));
        }
    }

    public boolean moreZero(final String cash) {
        if (Double.parseDouble(cash) > 0) {
            return true;
        }
        return false;
    }

}
