package loops;

public class Demo {
    public static void main(String[] args) { //początek bloku
        int x = 5;
        {
            int y = 10;
            y += x;
            System.out.println(y); // mam dostępm, w bloku
        }
//        System.out.println(y); // nie mam dostępu, koniec bloku
        System.out.println(x);

        int a = 7;

        if (a > 5) {
            System.out.println("A jest większe");
        }
        System.out.println("A jest większe");
        System.out.println("A jest większe");

        if (a > 5)
            System.out.println("A jest większe"); // zła praktyka, zawsze klamry!!!
        System.out.println("A jest większe");
        System.out.println("A jest większe");

        if (a > 5) {
            System.out.println("A jest większe");
        } else {
            System.out.println("A jest mniejsze");
        }

        if (a > 0) {
            System.out.println("a jest większe od zera");
        } else if (a < 0) {
            System.out.println("a jest mniejsze od zera");
        } else {
            System.out.println("a jest równe zero");
        }

    } //koniec bloku
}
