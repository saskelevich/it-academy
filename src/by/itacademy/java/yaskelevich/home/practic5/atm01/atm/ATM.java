package by.itacademy.java.yaskelevich.home.practic5.atm01.atm;

import java.util.ArrayList;

import by.itacademy.java.yaskelevich.home.practic5.atm01.atm.action.Account;
import by.itacademy.java.yaskelevich.home.practic5.atm01.atm.action.Calculator;
import by.itacademy.java.yaskelevich.home.practic5.atm01.atm.action.Cell;
import by.itacademy.java.yaskelevich.home.practic5.atm01.atm.feedback.Display;
import by.itacademy.java.yaskelevich.home.practic5.atm01.atm.feedback.Keyboard;

public class ATM {
    private static final int[] CELL_NUMBERS = {50, 20, 10};

    private ArrayList<Cell> cell;
    private Account account;
    private Calculator calc;
    private Display display;
    private Keyboard keyboard;

    public ATM() {
        this.account = new Account();
        this.cell = new ArrayList<Cell>();
        basicInitCell();
        this.calc = new Calculator();
        this.display = new Display();
        this.keyboard = new Keyboard();
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

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(final Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(final Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public boolean add() {
        return account.add(keyboard.input());
    }

    public boolean substract() {
        return account.substract(keyboard.input());
    }

    private void basicInitCell() {
        for (int i = 0; i < CELL_NUMBERS.length; i++) {
            cell.add(new Cell(CELL_NUMBERS[i], 0));
        }
    }

}
