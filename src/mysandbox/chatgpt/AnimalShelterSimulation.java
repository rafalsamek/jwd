package mysandbox.chatgpt;

import java.util.Random;

// Abstrakcyjna klasa Animal
abstract class Animal {
    private static int instanceCounter = 0;
    private final String type;

    public Animal(String type) {
        this.type = type;
        instanceCounter++;
    }

    // Abstrakcyjna metoda getType()
    public abstract String getType();

    // Metoda getInstanceNumber()
    public static int getInstanceNumber() {
        return instanceCounter;
    }
}

// Klasy reprezentujące różne zwierzęta
class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public String getType() {
        return "Dog";
    }
}

class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public String getType() {
        return "Cat";
    }
}

class Rabbit extends Animal {
    public Rabbit() {
        super("Rabbit");
    }

    @Override
    public String getType() {
        return "Rabbit";
    }
}

// Klasa AnimalShelter
class AnimalShelter {
    private final Animal[] cages;

    public AnimalShelter() {
        cages = new Animal[100];
        fillShelter();
    }

    // Wypełnienie schroniska losowymi zwierzętami
    private void fillShelter() {
        Random random = new Random();
        for (int i = 0; i < cages.length; i++) {
            int rand = random.nextInt(3);
            switch (rand) {
                case 0:
                    cages[i] = new Dog();
                    break;
                case 1:
                    cages[i] = new Cat();
                    break;
                case 2:
                    cages[i] = new Rabbit();
                    break;
            }
        }
    }

    // Wyświetlenie informacji o zwierzętach w danym kojcu oraz ich ilości w schronisku
    public void displayCageInfo(int cageNumber) {
        if (cageNumber < 0 || cageNumber >= cages.length) {
            System.out.println("Invalid cage number.");
            return;
        }

        Animal animal = cages[cageNumber];
        if (animal != null) {
            System.out.println("In cage " + cageNumber + ": " + animal.getType());
        } else {
            System.out.println("Cage " + cageNumber + " is empty.");
        }

        // Obliczenie ilości danego rodzaju zwierząt w schronisku
        int dogCount = countAnimals(Dog.class);
        int catCount = countAnimals(Cat.class);
        int rabbitCount = countAnimals(Rabbit.class);

        System.out.println("Number of dogs in the shelter: " + dogCount);
        System.out.println("Number of cats in the shelter: " + catCount);
        System.out.println("Number of rabbits in the shelter: " + rabbitCount);
    }

    // Metoda pomocnicza do zliczania ilości danego rodzaju zwierząt w schronisku
    private int countAnimals(Class<? extends Animal> animalClass) {
        int count = 0;
        for (Animal animal : cages) {
            if (animal != null && animalClass.isInstance(animal)) {
                count++;
            }
        }
        return count;
    }
}

public class AnimalShelterSimulation {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Wyświetlenie informacji o zwierzętach w kojcu nr 33
        shelter.displayCageInfo(33);
    }
}

