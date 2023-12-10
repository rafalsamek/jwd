package comparing;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee a = new Employee("Kowalski", 22, 4400);
        Employee b = new Employee("Kowalski", 22, 4400);
        Employee c = new Employee("Kowalski", 22, 4400);

        for (int i = 0; i < 1_000_000; i++) {
            if (!a.equals(b)) {
                System.out.println("Mamy cię!");
                System.exit(-1);
            }
        }
        System.out.println("Wszystko OK!");
    }
}
