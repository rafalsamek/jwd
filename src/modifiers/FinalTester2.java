package modifiers;

public class FinalTester2 {
    final int number;
    final static int number2 = 45; //musi być zainicjalizowana od razu

    public FinalTester2() {
        this.number = 45;
    }

    public static void main(String[] args) {
        final int number;

        System.out.println("Start");
        number = 1;
        System.out.println("Koniec");
//        number = 7;
    }
}
