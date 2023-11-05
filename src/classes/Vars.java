package classes;

public class Vars {

    int i; //zmienna egzemplarza (pole klasy, atrybut)
    static int j = 2; //zmienna klasowa (pole statyczne)

    public int change() {
        int k = 7; //zmienna lokalna

        return i + (k * j);
    }

    public static void main(String[] args) {
        int i = 77;
        Vars v1 = new Vars(); //to także zmienna lokalna
        v1.i = 9;
        System.out.println("Wyświetlamy zmienną egzemplarza dla v1: " + v1.i);

        Vars v2 = new Vars();
        v2.i = 5;
        System.out.println("Wyświetlamy zmienną egzemplarza dla v2: " + v2.i);

        System.out.println("Wyświetlam zmienną klasową (statyczną): " + Vars.j);

        System.out.println("Wyświetlam zmienną lokalną: " + i);
    }
}
