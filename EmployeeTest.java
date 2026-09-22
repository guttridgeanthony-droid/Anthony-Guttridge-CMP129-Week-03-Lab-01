/*
 * Student Name:Anthony Guttridge
 * Course: CMP 129
 */

public class EmployeeTest {
    public static void main(String[] args) {
        // Create employees using different overloaded constructors
        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");

        Employee emp2 = new Employee("Mark Jones", 39119);
        emp2.setDepartment("IT");
        emp2.setPosition("Programmer");

        Employee emp3 = new Employee();
        emp3.setName("Joy Rogers");
        emp3.setIdNumber(81774);
        emp3.setDepartment("Manufacturing");
        emp3.setPosition("Engineer");

        // Retrieve value using getter
        System.out.println("Retrieved Employee 1 Name: " + emp1.getName());
        System.out.println("---------------------------");

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}