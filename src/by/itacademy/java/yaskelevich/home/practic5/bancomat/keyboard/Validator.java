package by.itacademy.java.yaskelevich.home.practic5.bancomat.keyboard;

public class Validator {

//    private final static int FIFTY = 50;
//    private final static int TWENTY = 20;
//    private final static int TEN = 10;
//    private final static int TWO = 2;

    public static boolean isNumber(final String str) {
        try {
            Integer.parseInt(str);
        } catch (final NumberFormatException exc) {
            return false;
        }
        return true;
    }

    public static int returnDecimal(final String str) {
        return Character.digit(str.split("[.|$]")[0].charAt(str.split("[.|$]")[0].length() - 1),
                10);
    }
}
