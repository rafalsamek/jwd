package inner.lab.point1;

/**
 * Rozszerz przykład z robotami (klasy anonimowe) o robota witającego się w innym języku np. niemieckim.
 */
public class AnonymousClasses {
    public interface GreetingModule {
        void sayHello();
    }

    public static class Robot {
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething() {
            greetingModule.sayHello();
        }

        public static void main(String[] args) {
            Robot jan = new Robot(new GreetingModule() {
                @Override
                public void sayHello() {
                    System.out.println("Dzień dobry!");
                }
            });
            Robot john = new Robot(new GreetingModule() {
                @Override
                public void sayHello() {
                    System.out.println("Good Morning!");
                }
            });
            Robot johann = new Robot(new GreetingModule() {

                @Override
                public void sayHello() {
                    System.out.println("Guten Morgen!");
                }
            });

            jan.saySomething();
            john.saySomething();
            johann.saySomething();
        }
    }
}
