package enums.lab;

public class CardinalPointTester {
    public static void main(String[] args) {
        for (CardinalPoint cardinalPoint : CardinalPoint.values()) {
            System.out.println(cardinalPoint);
        }
        System.out.println();
        System.out.println(CardinalPoint.valueOf("N").getRotation());
    }
}
