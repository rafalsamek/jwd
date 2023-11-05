package arrays;

/**
 * Napisz program, który znajdzie najczęściej występującą cyfrę w tablicy.
 */
public class MostFrequent {
    public static void main(String[] args) {
        short[] input = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        short[] digits = new short[10];

        for (short element: input) {
            digits[element]++;
        }

        int mostFrequent = 0;
        short mostFrequentDigit = -1;
        for (int i = 0; i < 10; i++) {
            if (digits[i] > mostFrequent) {
                mostFrequent =digits[i];
                mostFrequentDigit = (short) i;
            }
        }

        System.out.println(mostFrequentDigit + "(" + mostFrequent + " razy)");
    }
}
