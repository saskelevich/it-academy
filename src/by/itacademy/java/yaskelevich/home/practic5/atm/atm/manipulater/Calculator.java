package by.itacademy.java.yaskelevich.home.practic5.atm.atm.manipulater;

import java.util.ArrayList;

import by.itacademy.java.yaskelevich.home.practic5.atm.atm.data.Cell;

public class Calculator {

    public ArrayList<Cell> writeCell(final ArrayList<Cell> cell, final String str) {
        return calc(cell, str);
    }

    private ArrayList<Cell> calc(final ArrayList<Cell> cell, final String str) {
        double cash = Double.parseDouble(str);
        for (int i = 0; i < cell.size(); i++) {
            if (cash >= cell.get(i).getNameCell()) {
                cell.get(i).setValue((int) (cash / cell.get(i).getNameCell()));
                cash -= cell.get(i).getNameCell() * cell.get(i).getValue();
            }
        }
        return cell;
    }
}
