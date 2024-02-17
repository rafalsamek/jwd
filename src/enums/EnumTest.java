package enums;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Types.ONE);
        System.out.println(Types.valueOf("TWO"));
        System.out.println(Types.THREE.name());

        System.out.println();

        for (Types type : Types.values()) {
            System.out.println(type.ordinal() + " " + type);
        }
    }
}
