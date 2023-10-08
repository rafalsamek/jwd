package datatypes;

public class EmployeeApplication {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.firstName = "Jan";
        employee.lastName = "Kowalski";
        employee.age = 25;
        employee.gender = 'm';
        employee.personalIDNumber = 8306112507L;

        employee.showDetails();
    }
}
