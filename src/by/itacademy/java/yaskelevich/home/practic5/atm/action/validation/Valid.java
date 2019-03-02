package by.itacademy.java.yaskelevich.home.practic5.atm.action.validation;

import java.util.ArrayList;

import by.itacademy.java.yaskelevich.home.practic5.atm.cell.Cell;

public class Valid {

    public boolean checkDecimal(final String str) {
        return ((Character.digit(str.split("[.|$]")[0].charAt(str.split("[.|$]")[0].length() - 1),
                10)) == 0);
    }

    public boolean isNumber(final String str) {
        try {
            Integer.parseInt(str);
        } catch (final NumberFormatException exc) {
            return false;
        }
        return true;
    }

    public double calcMoney(final int cell, final double money) {
        return (cell * (money / cell));
    }

    public int returnKolichestvoDeleniy(final double money, final int cell_numbers) {
        return (int) (money / cell_numbers);
    }
//    private void firstStep(final String cash) {
//        double money = Double.parseDouble(cash);
//        if (valid.checkDecimal(cash) && valid.isNumber(cash)) {
//            for (int i = 0; i < CELL_NUMBERS.length; i++) {
//                money = secondStep(money, CELL_NUMBERS[i]);
//            }
//        }
//    }

    public int searchIndexOfNumbers(final int numbers, final ArrayList<Cell> cell) {
        for (int index = 0; index < cell.size(); index++) {
            if (cell.get(index).getNumbers() == numbers) {
                return index;
            }
        }
        return -1;
    }

    public void write(final int index, final int value, final ArrayList<Cell> cell) {
        cell.get(index).setValue(value);
    }
}
