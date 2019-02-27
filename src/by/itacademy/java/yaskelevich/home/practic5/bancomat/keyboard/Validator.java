package by.itacademy.java.yaskelevich.home.practic5.bancomat.keyboard;

public class Validator {

    public static boolean isNumber(final String str) {
        try {
            Integer.parseInt(str);
        } catch (final NumberFormatException exc) {
            return false;
        }
        return true;
    }

    public static int checkDecimal(final String str) {
        return Character.digit(str.split("[.|$]")[0].charAt(str.split("[.|$]")[0].length() - 1),
                10);
    }
}
