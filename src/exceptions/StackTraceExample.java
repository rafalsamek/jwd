package exceptions;

public class StackTraceExample {
    public void method1() {
        method2();
    }

    public void method2() {
        method3();
    }

    public void method3() {
        throw new RuntimeException("Bum!");
    }

    public static void main(String[] args) {
        StackTraceExample example = new StackTraceExample();
        example.method1();
    }
}
