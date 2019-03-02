package by.itacademy.java.yaskelevich.home.practic5.atm01.atm.action;

import by.itacademy.java.yaskelevich.home.practic5.atm01.atm.action.action.Action;

public class Cell extends Action {
    private int nameCell;
    private int value;

    public Cell() {
        // TODO Auto-generated constructor stub
    }

    public Cell(final int nameCell, final int value) {
        this.nameCell = nameCell;
        this.value = value;
    }

    public int getNameCell() {
        return nameCell;
    }

    public void setNameCell(final int nameCell) {
        this.nameCell = nameCell;
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    @Override
    public boolean add(final String value) {
        return false;
    }

    @Override
    public boolean substract(final String value) {
        return false;
    }

}
