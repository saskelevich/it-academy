package by.itacademy.java.yaskelevich.home.practic5.atm.data;

public class Cell {
    private int nameCell;
    private int value;

    public Cell() {
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

}
