package classes;

class Averager {
    public static void main(String[] arguments) {
        int sum = 0;

        if (arguments.length > 0) { // parametry po spacji
            for (int i = 0; i < arguments.length; i++) {
                sum += Integer.parseInt(arguments[i]);
            }
            System.out.println("Suma wynosi: " + sum);
            System.out.println("Średnia wynosi: " + (double) sum / arguments.length);
        }
    }
}
