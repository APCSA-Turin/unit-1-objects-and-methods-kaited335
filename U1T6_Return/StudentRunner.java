package U1T6_Return;

public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Katie",11,3.9);
        student1.printIntroduction();
        student1.passing();

        Student student2 = new Student("Bob",7,1.7);
        student2.printIntroduction();
        student2.passing();
    }
    
}
