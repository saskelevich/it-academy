package by.itacademy.java.yaskelevich.home.practic7.ui.commands;

public class UIException extends RuntimeException {

    private static final long serialVersionUID = -4132093653348927983L;

    public UIException() {
    }

    public UIException(final String string) {
        super(string);
    }

    public UIException(final String string, final Throwable cause) {
        super(string, cause);
    }

    public UIException(final Throwable cause) {
        super(cause);
    }
}
