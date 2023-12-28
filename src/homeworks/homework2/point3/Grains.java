package homeworks.homework2.point3;

import java.math.BigInteger;

/**
 * Załóżmy, że na pierwsze pole szachownicy kładziemy 1 ziarno pszenicy,
 * na drugie 2 ziarna,
 * na trzecie 4 ziarna
 * i na każde następne pole dwa razy więcej ziaren niż na pole poprzednie.
 * Napisz program, który zasymuluje taką sytuację i zliczy sumę wszystkich ziaren na szachownicy.
 */
public class Grains {
    private static final int chessBoardSize = 64;

    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger squareValue = BigInteger.ONE;
        for (int i = 0; i < chessBoardSize; i++) {
            sum = sum.add(squareValue);
            squareValue = squareValue.multiply(BigInteger.TWO);
        }
        System.out.println("There are " + sum + " grains on the chessboard.");
    }
}
