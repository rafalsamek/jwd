package inner.lab.point2;

/**
 * Napisz potrójnie zagnieżdżoną klasę:
 * każda z klas powinna posiadać atrybut typu int,
 * utwórz instancję każdej z klas,
 * wyświetl wartość atrybutu każdej instancji.
 */
public class TripleNestedClass {
    public static void main(String[] args) {
        FirstNestedClass firstNestedClass = new FirstNestedClass();
        FirstNestedClass.SecondNestedClass secondNestedClass = firstNestedClass.new SecondNestedClass();
        FirstNestedClass.SecondNestedClass.ThirdNestedClass thirdNestedClass = secondNestedClass.new ThirdNestedClass();

        System.out.println("firstNestedClass->x = " + firstNestedClass.getX());
        System.out.println("secondNestedClass->x = " + secondNestedClass.getX());
        System.out.println("thirdNestedClass->x = " + thirdNestedClass.getX());
    }
}
class FirstNestedClass {
    private int x = 10;
    public int getX() {
        return x;
    }
    class SecondNestedClass {
        private int x = 20;
        public int getX() {
            return x;
        }
        class ThirdNestedClass {
            private int x = 30;
            public int getX() {
                return x;
            }
        }
    }
}
