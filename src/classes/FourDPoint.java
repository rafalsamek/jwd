package classes;

import java.awt.*;

/**
 * Utwórz klasę dla czterowymiarowego punktu o nazwie FourDPoint, wg wytycznych:
 * klasa FourDPoint powinna dziedziczyć po klasie Point z pakietu java.awt
 * napisz statyczną metodę create(int x, int y, int z, int t) tworzącą obiekt klasy FourDPoint
 * napisz metodę show() wypisującą wszystkie współrzędne
 * stwórz przykładowy 4-wymiarowy punkt i wyświetl jego współrzędne
 */
public class FourDPoint extends Point {
    public int z;

    public int t;

    private FourDPoint(int x, int y, int z, int t) {
        super(x, y);
        this.z = z;
        this.t = t;
    }

    public static void main(String[] args) {
        FourDPoint point = FourDPoint.create(3, 4, 5, 6);
        point.show();
    }

    public static FourDPoint create(int x, int y, int z, int t) {
        return new FourDPoint(x, y, z, t);
    }

    public void show() {
        System.out.println("Współrzędne punktu FourDPoint to: [x = " + this.x + ", y = " + this.y + ", z = " + this.z + ", t = " + this.t + "]");
    }
}
