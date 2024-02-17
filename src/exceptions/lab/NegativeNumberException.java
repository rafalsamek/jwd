package exceptions.lab;

public class NegativeNumberException extends ArithmeticException {
    public NegativeNumberException() {
    }

    public NegativeNumberException(String s) {
        super(s);
    }
}
