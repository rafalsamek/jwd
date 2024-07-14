package inner.ianonymous;

public class AnonymousDemo {
    public static void main(String[] args) {
        AnonymousDemo anonymousDemo = new AnonymousDemo();
        anonymousDemo.someMethod();
    }
    public interface GreetingModule {
        void sayHello();
    }

    public void someMethod() {
        GreetingModule greetingModule = new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Good Morning");
            }
        };
        greetingModule.sayHello();
    }
}
