package U3T6;

public class Student {
    private String first;
    private int points;
    private static int totalPointsEarned = 0;
    private static int greatestPoints = 0;

    public Student(String firstName) {
        first = firstName;
        points = 0;
    }

    public String studentInfo() {
        return "Student: " + first + "\nStudent's Points: " + points;
    }

    public void addPoints(int addPoints) {
        points += addPoints;
        totalPointsEarned += addPoints;
        if (points > greatestPoints) {
            greatestPoints = points;
        }
    }

    public int getTotalPointsEarned() {
        return totalPointsEarned;
    }

    public int getGreatestPoints() {
        return greatestPoints;
    }

    public static String classInfo() {
        return "Total points earned by all students: " + totalPointsEarned + "\nMost points earned by any student: " + greatestPoints;
    }
}
