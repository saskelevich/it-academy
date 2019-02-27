package by.itacademy.java.yaskelevich.home.practic5.bancomat.box;

import by.itacademy.java.yaskelevich.home.practic5.bancomat.display.Display;

public class CashBox {

    public static final int[] FIFTY = {50, 0};
    public static final int[] TWENTY = {20, 0};
    public static final int[] TEN = {10, 0};
    private double cash = 0;

    public void getMoney(final double money) {
        checkTen(checkTwenty(checkFifty(money)));
        Display.getMoney();
    }

    void checkTen(final double money) {
        cash = money;
        if (cash >= TEN[0]) {
            TEN[1] = (int) (cash / TEN[0]);
            cash -= TEN[0] * TEN[1];
        }
    }

    double checkTwenty(final double money) {
        cash = money;
        if (cash >= TWENTY[0]) {
            TWENTY[1] = (int) (cash / TWENTY[0]);
            cash -= TWENTY[0] * TWENTY[1];
        }
        return cash;
    }

    double checkFifty(final double money) {
        cash = money;
        if (cash >= FIFTY[0]) {
            FIFTY[1] = (int) (cash / FIFTY[0]);
            cash -= FIFTY[0] * FIFTY[1];
        }
        return cash;
    }
}
