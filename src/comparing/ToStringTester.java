package comparing;

import java.awt.*;

public class ToStringTester {
    public static void main(String[] args) {
        Integer i = 1;
        System.out.println(i.toString());
        System.out.println(i);

        Point point = new Point(3, 4);
        System.out.println(point);

        Employee employee = new Employee("Jan Kowalski", 33, 5345);
        System.out.println(employee.toString());
    }
}
