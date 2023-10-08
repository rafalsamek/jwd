package operators;

public class Investment {
    public static void main(String[] args) {
        double value = 14_000;

        value *= 1.4;
        value -= 1500;
        value *= 1.12;

        System.out.println("Inwestycja warta jest: " + value);
    }
}
