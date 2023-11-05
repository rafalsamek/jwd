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

        // operator trójargumentowy
        int myScore = 34;
        int yourScore = 44;
        int ourBestScore = myScore > yourScore ? myScore : yourScore;

        System.out.println("Najlepszy wynik to: " + ourBestScore);

        if (myScore > yourScore) {
            ourBestScore = myScore;
        } else {
            ourBestScore = yourScore;
        }
        System.out.println("Najlepszy wynik to: " + ourBestScore);

        for (int i = 1; i <= 100; i++) {
            System.out.println("i=" + i);
        }

        int i = 0;
        while (i <= 100) {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 100);

        // wypisz cyfry parzyste
        for (int j = 0; j < 10; j++) {
            if (j % 2 != 0) {
                continue;
            }
            System.out.print(j);
            System.out.print(" ");
        }

        out: for (i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.println(i + j);
                break out;
            }
        }

    } //koniec bloku
}
