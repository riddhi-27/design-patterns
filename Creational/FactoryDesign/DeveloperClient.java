public class DeveloperClient {

    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");

        int salary = employee.salary();

        System.out.println("Android Developer Salary : " + salary);

        Employee employee2 = EmployeeFactory.getEmployee("WEB DEVELOPER");

        int salary2 = employee2.salary();

        System.out.println("Web Developer Salary : " + salary2);

    }
}