package by.itacademy.java.yaskelevich.home.practic5.atm.action;

import java.util.ArrayList;

import by.itacademy.java.yaskelevich.home.practic5.atm.account.Account;
import by.itacademy.java.yaskelevich.home.practic5.atm.action.validation.Valid;
import by.itacademy.java.yaskelevich.home.practic5.atm.cell.Cell;

public class Output extends Action {
    Valid valid = new Valid();

    public Output() {

    }

    public Output(final Account account, final ArrayList<Cell> cell) {

    }

    public void substract(final String cash) {
        if (moreZero(cash)) {
            writeStepCell(cash);
        } else {
            return;
        }
        account.substract(Double.parseDouble(cash));

    }

    public void writeStepCell(final String cash) {
        double money = Double.parseDouble(cash);
        for (int i = 0; i < CELL_NUMBERS.length; i++) {
            valid.write((valid.searchIndexOfNumbers(CELL_NUMBERS[i], cell)),
                    valid.returnKolichestvoDeleniy(money, CELL_NUMBERS[i]), cell);
            money = valid.calcMoney(CELL_NUMBERS[i], money);
        }
    }

//    private int returnKolichestvoDeleniy(final double money, final int cell_numbers) {
//        return (int) (money / cell_numbers);
//    }
////    private void firstStep(final String cash) {
////        double money = Double.parseDouble(cash);
////        if (valid.checkDecimal(cash) && valid.isNumber(cash)) {
////            for (int i = 0; i < CELL_NUMBERS.length; i++) {
////                money = secondStep(money, CELL_NUMBERS[i]);
////            }
////        }
////    }
//
//    private int searchIndexOfNumbers(final int numbers) {
//        for (int index = 0; index < cell.size(); index++) {
//            if (cell.get(index).getNumbers() == numbers) {
//                return index;
//            }
//        }
//        return -1;
//    }
//
//    private void write(final int index, final int value) {
//        cell.get(index).setValue(value);
//    }
}
