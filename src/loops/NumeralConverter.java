package loops;

public class NumeralConverter {
    public static void main(String[] args) {
        System.out.println(convert("jeden"));
    }

    public static int convert(String str) {
        switch (str) {
            case "jeden":
            case "jedynka":
                return 1;
            case "dwa":
            case "dwójka":
                return 2;
            case "trzy":
            case "trójka":
                return 3;
            default:
                return 0;
        }
    }

    public static int convert2(String str) {
        return switch (str) {
            case "jeden":
            case "jedynka":
                yield 1;
            case "dwa":
            case "dwójka":
                yield 2;
            case "trzy":
            case "trójka":
                yield 3;
            default:
                yield 0;
        };
    }

    public static int convert3(String str) {
        return switch (str) {
            case "jeden", "jedynka" -> 1;
            case "dwa", "dwójka" -> 2;
            case "trzy", "trójka" -> 3;
            default -> 0;
        };
    }
}
