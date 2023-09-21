/**
 * This class demonstrates the use of the EmployeeFactory to create different types of employees
 * and print their salaries.
 */
public class DeveloperClient {

    /**
     * The main method creates instances of employees and prints their salaries.
     */
    public static void main(String[] args) {

        // Create a Web Developer using EmployeeFactory
        Employee employee = EmployeeFactory.getEmployee("Web Developer");
        assert employee != null; // Ensure employee is not null
        System.out.println("Salary : " + employee.salary()); // Print the salary

        // Create an Android Developer using EmployeeFactory
        Employee employee1 = EmployeeFactory.getEmployee("Android Developer");
        assert employee1 != null; // Ensure employee1 is not null
        System.out.println("Salary : " + employee1.salary()); // Print the salary
    }
}
