package exceptions;

public class ExceptionThrowDemo {
    public static void main(String[] args) {
        ExceptionThrowDemo etd = new ExceptionThrowDemo();
//        int hours = 3;
        int hours = -3;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = etd.getNumberOfSeconds(hours);
        } catch (IllegalArgumentException e) {
            numberOfSeconds = etd.getNumberOfSeconds(hours * -1);
        }
        System.out.println(numberOfSeconds);
    }

    public int getNumberOfSeconds(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Liczba godzin musi być większa od zera: " + hours);
        }
        return hours * 60 * 60;
    }
}
