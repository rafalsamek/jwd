package homeworks.homework1.point4;

import homeworks.homework1.point4.operations.Operation;

public class IntOperationPresenter {
    private Operation operation;

    public IntOperationPresenter(Operation operation) {
        this.operation = operation;
    }

    public void present(int a, int b) {
        presentDecimal(a, b);
        presentBinary(a, b);
        presentOctal(a, b);
        presentHex(a, b);
    }

    public void presentDecimal(int a, int b) {
        System.out.println(a + " " + this.operation.getOperator() + " " + b + " = " + this.operation.calculate(a, b));
        System.out.println();
    }

    public void presentBinary(int a, int b) {
        System.out.println("binarnie (" + this.operation.getOperator() + ")");
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println("----------");
        System.out.println(Integer.toBinaryString(this.operation.calculate(a, b)));
        System.out.println();
    }

    public void presentOctal(int a, int b) {
        System.out.println("ósemkowo (" + this.operation.getOperator() + ")");
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toOctalString(b));
        System.out.println("----------");
        System.out.println(Integer.toOctalString(this.operation.calculate(a, b)));
        System.out.println();
    }

    public void presentHex(int a, int b) {
        System.out.println("szesnastkowo (" + this.operation.getOperator() + ")");
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toHexString(b));
        System.out.println("----------");
        System.out.println(Integer.toHexString(this.operation.calculate(a, b)));
        System.out.println();
    }
}
