package inner.ianonymous;

public class AnonymousDemo2 {
    public static void main(String[] args) {
        AnonymousDemo2 anonymousDemo = new AnonymousDemo2();
        anonymousDemo.someMethod();
    }

    interface GreetingModule {
        void sayHello();
    }

    public class GreetingModuleImpl implements GreetingModule {

        @Override
        public void sayHello() {
            System.out.println("Good Morning");
        }
    }

    public void someMethod() {
        GreetingModule greetingModule = new GreetingModuleImpl();
        greetingModule.sayHello();
    }
}
