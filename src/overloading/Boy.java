package overloading;

/**
 * Stwórz klasy Human oraz Boy ustawiając je w odpowiedniej relacji.
 * Na przykładzie symbolicznej metody eat() zademonstruj działanie mechanizmu przesłaniania.
 */
public class Boy extends Human {

    public void eat() {
        System.out.println("Boy eat");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.eat();

        Boy boy = new Boy();
        boy.eat();
    }
}
