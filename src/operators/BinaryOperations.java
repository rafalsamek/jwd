package operators;

public class BinaryOperations {
    public static void main(String[] args) {
        byte a = 0b11001;
        byte b = 0b11101;
        byte c = 0b00011;
        byte expected = 0b11010;

        byte result;

        result = (byte) (a & b ^ c);

        if (result == expected) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}
