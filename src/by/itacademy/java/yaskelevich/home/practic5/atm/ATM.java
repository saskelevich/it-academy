package by.itacademy.java.yaskelevich.home.practic5.atm;

import java.util.ArrayList;

import by.itacademy.java.yaskelevich.home.practic5.atm.data.Account;
import by.itacademy.java.yaskelevich.home.practic5.atm.data.Cell;
import by.itacademy.java.yaskelevich.home.practic5.atm.manipul.Calculator;
import by.itacademy.java.yaskelevich.home.practic5.atm.manipul.Validator;
import by.itacademy.java.yaskelevich.home.practic5.caunting.ICounting;

public class ATM implements ICounting {
//    public static final int[] CELL_NUMBERS = {50, 20, 10};
    private static final int[] CELL_NUMBERS = {50, 20, 10};

    private ArrayList<Cell> cell;
    private Account account;
    private Calculator calc;
    private final Validator valid;

    public ATM() {
        this.account = new Account();
        this.cell = new ArrayList<Cell>();
        basicInitCell();
        this.calc = new Calculator();
        this.valid = new Validator();
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

    public Calculator getCalc() {
        return calc;
    }

    public void setCalc(final Calculator calc) {
        this.calc = calc;
    }

    @Override
    public boolean add(final String str) {
        if (valid.isNumber(str)) {
            return account.add(str);
        }
        return false;
    }

    @Override
    public boolean substract(final String str) {
        if (valid.isNumber(str) && valid.isLastZero(str)
                && valid.howMatch(str, account.getBalance())) {
            calc.writeCell(cell, str);
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