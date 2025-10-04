package U1T6_Return;

public class Student {
    String name;
    int grade;
    double GPA;
    public Student(String studentName, int studentGrade, double studentGPA) {
        name = studentName;
        grade = studentGrade;
        GPA = studentGPA;
    }
    public void printIntroduction() {
        System.out.println("My name is " + name + ". I'm in grade " + grade + " and my GPA is " + GPA + ".");
    }
    public void passing() {
        if (GPA < 2.0) {
            System.out.println("I am failing grade " + grade + ".");
        } else {
            System.out.println("I am passing grade "+ grade + ".");
        }
    }
}