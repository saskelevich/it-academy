package by.itacademy.java.yaskelevich.home.practic5.atm.action;

import java.util.ArrayList;

import by.itacademy.java.yaskelevich.home.practic5.atm.account.Account;
import by.itacademy.java.yaskelevich.home.practic5.atm.cell.Cell;

public class Input extends Action {

    public Input() {
    }

    public Input(final Account account, final ArrayList<Cell> cell) {

    }

    public void add(final String cash) {
        if (moreZero(cash)) {
            account.add(Double.parseDouble(cash));
        }
        return;
    }
}
