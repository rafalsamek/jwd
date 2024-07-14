package inner.istatic;

public class StaticInnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner1 = outer.instantiate();
        Outer.Inner inner2 = new Outer.Inner();
        Outer.MyEnum myEnum = Outer.MyEnum.ONE;
    }
}

class Outer {
    static class Inner {

    }

    public Inner instantiate() {
        return new Inner();
    }

    interface MyInterface {}

    enum MyEnum {ONE}
}
