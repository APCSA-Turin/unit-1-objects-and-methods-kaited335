import java.util.ArrayList;

public class NotAlone {
  public NotAlone() {}

  public ArrayList<Integer> notAlone(ArrayList<Integer> list, int val) {
    int higher = 0;
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) == val) {
            if (i == list.size() - 1) {
                list.set(i, list.get(i - 1));
            }
        } else if (i == 0) {
            list.set(i, list.get(i + 1));
        } else {
            higher = list.get(i - 1); 
            if (list.get(i + 1) > higher) {
                higher = list.get(i + 1);
            }
            list.set(i, higher);
        }
    }
    return list;
  }
}