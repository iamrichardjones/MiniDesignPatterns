package formattingexceptions;


public class FormattedException extends Exception {

    public FormattedException(String msg, String format) {
        this(String.format(msg, format));
    }

    public FormattedException(String msg, String format, Throwable t) {
        this(String.format(msg, format), t);
    }

    public FormattedException(String msg) {
        super(msg);
    }

    public FormattedException(Throwable t) {
        super(t);
    }

    public FormattedException(String msg, Throwable t) {
        super(msg, t);
    }
}
