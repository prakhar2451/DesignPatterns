/**
 * The EmployeeFactory class is responsible for creating instances of different types of employees.
 */
public class EmployeeFactory {

    /**
     * Returns an instance of the specified type of employee
     * @param empType The type of employee to be created ("Android Developer" or "Web Developer").
     * @return An instance of the specified type of employee, or null if the type is not recognized.
     */
    public static Employee getEmployee(String empType){

        // Check if the type is Android Developer
        if(empType.trim().equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper(); // Create and return a new Android Developer instance
        }

        // Check if the type is Web Developer
        else if(empType.trim().equalsIgnoreCase("Web Developer")){
            return new WebDeveloper(); // Create and return a new Web Developer instance
        }

        // If the type is not recognized, return null
        else{
            return null;
        }
    }
}
