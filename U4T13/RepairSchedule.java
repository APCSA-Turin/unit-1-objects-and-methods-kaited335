import java.util.ArrayList;

import U1T6_Return.chatbotRunner;

public class RepairSchedule {
    /** Each element represents a repair by an individual mechanic in a bay. */
    private ArrayList<CarRepair> schedule;

    /** Number of mechanics available in this schedule. */
    private int numberOfMechanics;

    /** Constructs a RepairSchedule object as described in part (a).
     * Precondition: n >= 0
     */
    public RepairSchedule(int n) {
        numberOfMechanics = n;
        schedule = new ArrayList<CarRepair>();
    }

    public ArrayList<CarRepair> getSchedule() {
        return schedule;
    }

    /** Attempts to schedule a repair by a given mechanic in a given bay as described in part (b).
     * Precondition: 0 <= m < numberOfMechanics and b >= 0
     */
    public boolean addRepair(int m, int b) {
        for (int i = 0; i < schedule.size(); i++) {
            if (schedule.get(i).getBayNum() == b && schedule.get(i).getMechanicNum() == m) {
                return false;
            } 
        }
        schedule.add(new CarRepair(m, b));
        return true;
    }

    /** Returns an ArrayList containing the mechanic identifiers of all available mechanics,
     * as described in part (c).
     */
    public ArrayList<Integer> availableMechanics() {
        boolean inList = false;
        ArrayList<Integer> mech = new ArrayList<Integer>();
        for (int i = 0; i < numberOfMechanics; i++) {
            for (int j = 0; j < schedule.size(); j++) {
                if (schedule.get(j).getMechanicNum() == i) {
                    inList = true;
                }
            }
            if (!inList) {
                mech.add(i);
            }
        }
        return mech;
    }

    /** Removes an element from schedule when a repair is complete.
        THIS METHOD HAS BEEN ADDED FOR ILLUSTRATIVE PURPOSES ONLY,
        AS DESCRIBED IN PART B; you do NOT need to call this
        method as part of your solution to part B
      */
    public void carOut(int b) {
        for (int i = 0; i < schedule.size(); i++) {
            CarRepair carAtIdx = schedule.get(i);
            if (carAtIdx.getBayNum() == b) {
                schedule.remove(i);
            }
        }
    }
}