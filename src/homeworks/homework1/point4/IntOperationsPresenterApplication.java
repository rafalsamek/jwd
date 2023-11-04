package homeworks.homework1.point4;

import homeworks.homework1.point4.operations.Add;
import homeworks.homework1.point4.operations.Divide;
import homeworks.homework1.point4.operations.Multiply;
import homeworks.homework1.point4.operations.Subtract;

public class IntOperationsPresenterApplication {
    public static void main(String[] args) {
        int a = 134;
        int b = 45;

        IntOperationPresenter addPresenter = new IntOperationPresenter(new Add());
        addPresenter.present(a, b);

        IntOperationPresenter subtractPresenter = new IntOperationPresenter(new Subtract());
        subtractPresenter.present(a, b);

        IntOperationPresenter multiplyPresenter = new IntOperationPresenter(new Multiply());
        multiplyPresenter.present(a, b);

        IntOperationPresenter dividePresenter = new IntOperationPresenter(new Divide());
        dividePresenter.present(a, b);
    }
}
