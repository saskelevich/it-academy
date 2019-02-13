package by.itacademy.java.yaskelevich.home.practic1.var1.validation;

public class Validator {

    public int converter(final String str) {
        int num = 0;
        try {
            num = Integer.parseInt(str);
        } catch (final NumberFormatException exc) {
            System.out.println(exc);
            return 0;
        }
        return validator(num);
    }

    private int validator(final int num) {
        if ((num > 0) && (num < 13)) {
            return num;
        }
        return 0;
    }

}
