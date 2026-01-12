import U3T6.Employee;

public class Main {
     public static void main(String[] args) {
        Employee employee1 = new Employee("Jim", "Mason");
        System.out.println(employee1.employeeInfo());
        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());
        Employee employee2 = new Employee("Amy", "Adams");
        System.out.println(employee2.employeeInfo());
        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());
        System.out.println(employee1.employeeInfo());
        System.out.println(employee2.employeeInfo());
        Employee employee3 = new Employee("Bob", "Ross");
        System.out.println(employee3.employeeInfo());
        Employee employee4 = new Employee("Cindy", "Nox");
        System.out.println(employee3.employeeInfo());
        System.out.println(employee1.employeeInfo());
        System.out.println(employee2.employeeInfo());
        System.out.println(employee3.employeeInfo());
        System.out.println(employee3.employeeInfo());
        System.out.println(Employee.getMostRecentEmployeeID());
        System.out.println(Employee.getTotalEmployeesCreated());
    }
}
