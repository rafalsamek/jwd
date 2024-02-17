package exceptions.lab;

public class NegativeNumberException extends IllegalArgumentException {
    public NegativeNumberException() {
    }

    public NegativeNumberException(String s) {
        super(s);
    }
}
