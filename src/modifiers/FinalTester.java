package modifiers;

public class FinalTester {
    public static int number = 0;

    public static void main(String[] args) {
        FinalTester f1 = new FinalTester();
        FinalTester f2 = new FinalTester();
        FinalTester f3 = new FinalTester();

        System.out.println(f1.number);
        System.out.println(f2.number);
        System.out.println(f3.number);

        f3.number = 99;

        System.out.println(f1.number);
        System.out.println(f2.number);
        System.out.println(f3.number);
    }
}
