public class ActivityTracker {
    private int goal;
    private int totalMinutes;
    private int sessions;
    private int longSes;

    public ActivityTracker(int targetGoal) {
        goal = targetGoal;
        totalMinutes = 0;
        sessions = 0;
        longSes = 0;
    }

    public int getTargetGoal() {
        return goal;
    }

    public void logMinutes(int minutes) {
        totalMinutes += minutes;
        if (longSes < minutes) {
            longSes = minutes;
        }
        sessions ++;
    }

    public int getSessions() {
        return sessions;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public int getMaxMinutes() {
        return longSes;
    }

    public boolean goalAchieved() {
        if (totalMinutes >= goal) {
            return true;
        } else {
            return false;
        }
    }
}