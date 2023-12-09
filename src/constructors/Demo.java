package constructors;

public class Demo {

    //Demo() {} domyślny, nie trzeba go pisać

    Demo() {}

    Demo(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Demo demo1 = new Demo();
        Demo demo2 = new Demo("Hello");

        new A();
        new B();

        new A("Hello");
        new B("Hello");
    }
}

class A {
    public A() {
//        super();
        System.out.println("Działa konstruktor A()");
    }

    public A(String param) {
        System.out.println("Działa konstruktor A(" + param + ")");
    }
}

class B extends A {
    public B() {
//        super();
        System.out.println("Działa konstruktor B()");
    }

    public B(String param) {
        super(param);
        System.out.println("Działa konstruktor B(" + param + ")");
    }
}
