package homeworks.homework1.point4.operations;

public class Divide implements Operation{
    public char getOperator() {
        return '/';
    }

    public int calculate(int a, int b) {
        return a / b;
    }
}
