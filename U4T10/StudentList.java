import java.util.ArrayList;

public class StudentList {
    

    public static ArrayList<Student> sortStudents(ArrayList<Student> studentsToSort) {
        for (int i = 1; i < studentsToSort.size(); i++) {
            int place = i;
            boolean check = false;
            while (!check || place > 0) {
                String lastCompare = studentsToSort.get(place).getLastName();
                String lastOther = studentsToSort.get(place - 1).getLastName();
                if (lastCompare.compareTo(lastOther) < 0) {
                    Student temp = studentsToSort.remove(place);
                    studentsToSort.add(place - 1, temp);
                    place--;
                } else if (lastCompare.compareTo(lastOther) == 0) {
                    String firstCompare = studentsToSort.get(place).getFirstName();
                    String firstOther = studentsToSort.get(place - 1).getFirstName();
                    if (firstCompare.compareTo(firstOther) < 0) {
                        Student temp = studentsToSort.remove(place);
                        studentsToSort.add(place - 1, temp);
                        place--;
                    } else if (firstCompare.compareTo(firstOther) == 0) {
                        double gpaCompare = studentsToSort.get(place).getGpa();
                        double gpaOther = studentsToSort.get(place - 1).getGpa();
                        if (gpaCompare > gpaOther) {
                            Student temp = studentsToSort.remove(place);
                            studentsToSort.add(place - 1, temp);
                            place--;
                        }
                    }
                } else {
                    check = true;
                }
            }
            
        }
        return studentsToSort;
    }

}
