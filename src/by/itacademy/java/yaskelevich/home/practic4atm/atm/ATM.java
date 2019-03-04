package by.itacademy.java.yaskelevich.home.practic4atm.atm;

import java.util.ArrayList;

import by.itacademy.java.yaskelevich.home.practic4atm.atm.data.Account;
import by.itacademy.java.yaskelevich.home.practic4atm.atm.data.Cell;
import by.itacademy.java.yaskelevich.home.practic4atm.atm.utility.Calculator;
import by.itacademy.java.yaskelevich.home.practic4atm.atm.utility.Validator;
import by.itacademy.java.yaskelevich.home.practic4atm.counting.ICounting;

public class ATM implements ICounting {
    private static final int[] CELL_NUMBERS = {50, 20, 10};

    private ArrayList<Cell> cell;
    private Account account;

    public ATM() {
        this.account = new Account();
        this.cell = new ArrayList<Cell>();
        basicInitCell();
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

    @Override
    public boolean add(final String str) {
        if (Validator.isNumber(str)) {
            return account.add(str);
        }
        return false;
    }

    @Override
    public boolean substract(final String str) {
        if (Validator.isNumber(str) && Validator.isLastZero(str)
                && Validator.howMatch(str, account.getBalance())) {
            Calculator.writeCell(cell, str);
            return account.substract(str);
        }
        return false;
    }

    private void basicInitCell() {
        for (int i = 0; i < CELL_NUMBERS.length; i++) {
            cell.add(new Cell(CELL_NUMBERS[i], 0));
        }
    }

}
