package tests.test3;

/**
 * Należy stworzyć klasę reprezentującą użytkownika o nazwie User.
 * Instancje wspomnianej klasy powinny przechowywać informacje o identyfikatorze użytkownika, nazwie - name  oraz wieku - age.
 * Klasa powinna być wyposażona w metodę toString().
 * W celu sprawdzenia poprawności działania klasy, należy utworzyć kilku użytkowników, umieścić stworzone obiekty w 10
 * elementowej tablicy a następnie iterując po tablicy wyświetlić informacje o przechowywanych użytkownikach.
 */
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        User[] users = new User[10];

        users[0] = new User("Rafał", 41);
        users[1] = new User("Ewa", 30);
        users[2] = new User("Łukasz", 32);

        for (User user : users) {
            System.out.println(user);
        }
    }
}
