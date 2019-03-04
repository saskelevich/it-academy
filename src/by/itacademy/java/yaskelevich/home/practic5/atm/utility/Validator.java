package by.itacademy.java.yaskelevich.home.practic5.atm.utility;

public abstract class Validator {

    public static boolean isNumber(final String str) {
        try {
            Double.parseDouble(str);
        } catch (final NumberFormatException exc) {
            return false;
        }
        return true;
    }

    public static boolean isLastZero(final String str) {
        return (Character.digit(str.split("[.|,]")[0].charAt(str.split("[.|,]")[0].length() - 1),
                10) == 0);
    }

    public static boolean howMatch(final String str, final double balance) {
        if (Double.parseDouble(str) <= balance) {
            return true;
        }
        return false;
    }
}
