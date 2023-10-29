package homeworks.homework1;

public class AnimalsApplication {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Cat says: " + cat.say());

        Dog dog = new Dog();
        System.out.println("Dog says: " + dog.say());
    }
}
