package interfaces;

public class PolymorphismAnimals {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Bird()};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
