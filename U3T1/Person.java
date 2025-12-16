package U3T1;

public class Person {
    private String first;
    private String last;
    private int meetingCount;
    
    public Person(String firstName, String lastName) {
        first = firstName;
        last = lastName;
        meetingCount = 0;
    }

    public int getMeetings() {
        return meetingCount;
    }

    public String getFirst() {
        return first;
    }

    public String getlast() {
        return last;
    }

    public void addMeetingCount() {
        meetingCount++;
    }

    public void meet(Person person) {
        System.out.println("Hello, my name is " + first);
        System.out.println("Hi, my name is " + person.getFirst());
        meetingCount++;
        person.addMeetingCount();
    }
}
