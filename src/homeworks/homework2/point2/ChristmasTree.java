package homeworks.homework2.point2;

import java.util.Random;

/**
 * Napisz program wyświetlający świąteczną choinkę
 * składającą się z losowych elementów następującego zbioru znaków ASCII: ‘+', ‘.', ‘*', ‘~', ‘^', ‘o'.
 * Wysokość choinki powinna być podawana jako argument programu.
 * Jeżeli wysokość nie zostanie określona to powinna zostać przyjęta domyślna wartość 18.
 */
public class ChristmasTree {
    private int height = 18;
    private char[] signs = {'+', '.', '*', '~', '^', 'o'};

    public ChristmasTree(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTree(args.length > 0 ? Integer.parseInt(args[0]) : 18);
        christmasTree.display();
    }

    private void display() {
        Random random = new Random();
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(this.signs[random.nextInt(6)]);
            }
            for (int j = 0; j < this.height - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
