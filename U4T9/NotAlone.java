import java.util.ArrayList;

public class NotAlone {

public NotAlone() {}

public ArrayList<Integer> notAlone(ArrayList<Integer> list, int val) {
    if (list.size() == 0 || list.size() == 1) {
        return list;
    }
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) == val && i == 0) {
            int temp = list.get(1);
            if (temp > val || temp == val) {
                list.set(i, temp);
            }
        } else if (list.get(i) == val && i == list.size()-1) {
            int temp = list.get(i-1);
            if (temp > val || temp == val) {
            list.set(i, temp);
            }
        } else if (list.get(i) == val) {
            int temp1 = list.get(i-1), temp2 = list.get(i+1);
            if (temp2 > temp1 || temp2 == val || temp2 == temp1) {
                list.set(i, temp2);
            } else if (temp2 < temp1 || temp1 == val) {
                list.set(i, temp1);
            }
        }
    }
    return list;
    }
}
