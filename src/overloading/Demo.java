package overloading;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        a.show();

        B b = new B();
        b.show();
    }
}

class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    void show() {
        System.out.println("B");
    }
}
