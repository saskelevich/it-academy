package by.itacademy.java.yaskelevich.home.practic5.atm.atm.manipulater;

public class Validator {

    public boolean isNumber(final String str) {
        try {
            Integer.parseInt(str);
        } catch (final NumberFormatException exc) {
            return false;
        }
        return true;
    }

    public boolean isLastZero(final String str) {
        return (Character.digit(str.split("[.|,]")[0].charAt(str.split("[.|,]")[0].length() - 1),
                10) == 0);
    }

    public boolean howMatch(final String str, final double balance) {
        if (Double.parseDouble(str) <= balance) {
            return true;
        }
        return false;
    }
}
