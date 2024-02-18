package exceptions;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        UncheckedExceptionDemo ued = new UncheckedExceptionDemo();
//        int i = ued.getNumberFromString("9");
        int i = ued.getNumberFromString("dziewieć");
        System.out.println("Oto nasza liczba pomnożona przez 99: " + (i * 99));
    }

    public int getNumberFromString(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Błąd: " + e.getMessage());
            System.exit(-1);
        }
        return -1;
    }
}
