package by.itacademy.java.yaskelevich.home.practic5.atm.cell;

public class Cell {

    private int value;
    private int numbers;

    public Cell(final int name) {
        this.numbers = name;
    }

    public Cell(final int value, final int name) {
        this.value = value;
        this.numbers = name;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(final int name) {
        this.numbers = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

}
