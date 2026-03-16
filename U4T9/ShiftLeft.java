import java.util.ArrayList;

public class ShiftLeft {
  public ShiftLeft() {}

  public ArrayList<Integer> shiftLeft(ArrayList<Integer> list) {
    if (list.size() == 0) {
        return list;
    }
    int number = list.remove(0);
    list.add(number);
    return list;
  }
}