package U3T6;

public class Employee {
    private String first;
    private String last;
    private int employeeID;
    private static int mostRecentEmployee;
    private static int totalEmployeeCreated;

    public Employee(String firstName, String lastName) {
        first = firstName;
        last = lastName;
        if (totalEmployeeCreated == 0) {
            employeeID = 100;
        } else {
            employeeID = mostRecentEmployee + 1;
        }
        mostRecentEmployee = employeeID;
        totalEmployeeCreated ++;
    }

    public String getFullName() {
        return first + " " + last;
    }

    public int getID() {
        return employeeID;
    }

    public static int getMostRecentEmployeeID() {
        return mostRecentEmployee;
    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeeCreated;
    }

    public String employeeInfo() {
        return "--------------------------\nEmployee full name: " + getFullName() + "\nEmployee ID: " + getID() + "\nMost recent ID assigned: " + getMostRecentEmployeeID() + "\nTotal employees hired: " + getTotalEmployeesCreated() + "\n--------------------------";
    }
    
}
