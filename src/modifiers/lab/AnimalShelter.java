package modifiers.lab;

import java.util.Random;

/**
 * Napisz program symulujący działanie schroniska dla zwierząt, w tym celu:
 *
 * stwórz abstrakcyjną klasę Animal z dwoma abstrakcyjnymi metodami getType() oraz getInstanceNumber()
 * zadaniem metody getType() będzie zwrócenie typu zwierzęcia jako tekst np. pies, kot itp.
 * zadaniem metody getInstanceNumber() będzie zwrócenie liczby utworzonych obiektów danej klasy (podklasy Animal)
 * stwórz 3 klasy reprezentujące zwierzęta, klasy powinny rozszerzać klasę Animal i implementować odpowiednie metody
 * w tworzonych klasach zastosuj zasady hermetyzacji
 * w klasie AnimalShelter przechowuj zwierzęta w tablicy 100-elementowej imitującej kojce (jeden kojec mieści jedno zwierzę)
 * zwierzęta umieszczaj w kojcach losowo
 * wyświetl informacje jakie zwierzę zostało umieszczone w kojcu nr 33 oraz ile tego rodzaju zwierząt przebywa obecnie w schronisku
 * Podpowiedź:
 *
 * do wylosowania liczby całkowitej z przedziału od 0 do 2 użyj konstrukcji:
 * Random random = new Random();
 * int i = random.nextInt(3);
 */
public class AnimalShelter {
    public static void main(String[] args) {
        //kojce
        Animal[] beds = new Animal[100];

        //umieszczanie zwierząt losowo w kojcach
        Random random = new Random();
        for (int i = 0; i < beds.length; i++) {
            beds[i] = switch (random.nextInt(3)) {
                case 0 -> new Dog();
                case 1 -> new Cat();
                case 2 -> new Turtle();
                default -> null;
            };
        }

        //pokaż zwierzę w kojcu 33
        System.out.print("Zwierzę w kojcu o nr 33 to: ");
        showAnimal(beds[32]);

        //pokaż ile tego rodzaju zwierząt przebywa obecnie w schronisku
        System.out.println("Obecnie w schronisku jest " + beds[32].getInstanceNumber() + " zwierząt typu " + beds[32].getType());
    }

    private static void showAnimal(Animal animal) {
        System.out.println(animal.getType());
    }
}
