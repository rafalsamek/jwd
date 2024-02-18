package interfaces;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator adder = new Calculator() {
            @Override
            public int performOperation(int a, int b) {
                return a + b;
            }
        };

        Calculator multiplier = (a, b) -> a * b;

        System.out.println(adder.performOperation(1, 2));
        System.out.println(multiplier.performOperation(2, 4));
        adder.sampleDefaultMethod();
    }
}
