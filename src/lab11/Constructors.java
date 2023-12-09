package lab11;

/**
 * Zaprojektuj hierarchię klas tak, aby:
 *
 * klasa C dziedziczyła po klasie B, a klasa B dziedziczyła po klasie A
 * instrukcja new C(); lub new B(); lub new A(); wyświetliła kolejno informacje o wywoływaniu poszczególnych konstruktorów wszystkich klas
 * instrukcja new C(true); lub new B(true); lub new A(true); utworzyła konkretny obiekt nie informując o wywołaniu konstruktorów
 * instrukcja new C(false); lub new B(false); lub new A(false); utworzyła konkretny obiekt informując tylko o wywołaniu “pierwszego” konstruktora (konstruktory klas bazowych milczą)
 */
public class Constructors {
    public static void main(String[] args) {
        new A();
        new B();
        new C();

        new A(true);
        new B(true);
        new C(true);

        new A(false);
        new B(false);
        new C(false);
    }
}

class A {
    A() {
        System.out.println("A()");
    }

    A(boolean param) {
        if (!param && this.getClass().getSimpleName().equals("A")) {
            System.out.println("A(false)");
        }
    }
}

class B extends A {
    B() {
        System.out.println("B()");
    }

    B(boolean param) {
        super(param);
        if (!param && this.getClass().getSimpleName().equals("B")) {
            System.out.println("B(false)");
        }
    }
}

class C extends B {
    C() {
        System.out.println("C()");
    }

    C(boolean param) {
        super(param);
        if (!param && this.getClass().getSimpleName().equals("C")) {
            System.out.println("C(false)");
        }
    }
}
