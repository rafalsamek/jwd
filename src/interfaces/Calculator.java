package interfaces;

//interfejs funkcyjny
@FunctionalInterface
public interface Calculator {
    int performOperation(int a, int b);

    static void sampleStaticMethod() {
        System.out.println("statyczna metoda");
    }

    default void sampleDefaultMethod() {
        System.out.println("domyślna metoda");
    }
}
