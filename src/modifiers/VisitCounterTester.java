package modifiers;

public class VisitCounterTester {
    public static void main(String[] args) {
        VisitCounter vc = new VisitCounter();
        vc.increment();
        vc.increment();
        vc.increment();
//        vc.counter++;
//        vc.counter = 1000;
//        vc.counter = -1;

        System.out.println(vc.getCounter());
    }
}
