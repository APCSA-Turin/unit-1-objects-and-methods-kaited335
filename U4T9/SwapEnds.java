import java.util.ArrayList;

public class SwapEnds {
  public SwapEnds() {}

  public ArrayList<Integer> swapEnds(ArrayList<Integer> list) {
    if (list.size() < 2) {
        return list;
    }
    int temp = list.remove(0);
    list.add(0, (list.get(list.size() - 1)));
    list.remove(list.size() - 1);
    list.add(temp);
    return list;
  }
}