package mysandbox.chatgpt;

import java.math.BigInteger;

public class WheatGrainsSimulation {

    public static void main(String[] args) {
        int boardSize = 8; // Rozmiar szachownicy
        BigInteger totalGrains = simulateWheatGrains(boardSize);

        System.out.println("Liczba ziaren pszenicy na szachownicy o rozmiarze " + boardSize + "x" + boardSize + ": " + totalGrains);
    }

    private static BigInteger simulateWheatGrains(int boardSize) {
        BigInteger totalGrains = BigInteger.ZERO;
        BigInteger currentGrains = BigInteger.ONE; // Początkowa liczba ziaren na pierwszym polu

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                totalGrains = totalGrains.add(currentGrains);
                currentGrains = currentGrains.multiply(BigInteger.valueOf(2));
            }
        }

        return totalGrains;
    }
}
