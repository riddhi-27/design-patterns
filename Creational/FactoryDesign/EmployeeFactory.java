public class EmployeeFactory {

    // get the employee
    public static Employee getEmployee(String empType) {

        if (empType.equals("ANDROID DEVELOPER")) {

            return new AndroidDeveloper();

        } else if (empType.equals("WEB DEVELOPER")) {

            return new WebDeveloper();

        } else {
            
            return null;
        }
    }
}