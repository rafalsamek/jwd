package comparing;

public class Employee {
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

//    public String toString() {
//        return "Pracownik: " + this.name + "\nWiek: " + this.age + "\nZarobki: " + this.salary + " zł";
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
