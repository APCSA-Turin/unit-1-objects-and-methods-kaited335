import java.util.ArrayList;

public class ZeroFront {
  public ZeroFront() {}

  public ArrayList<Integer> zeroFront(ArrayList<Integer> list) {
    int count = 0;
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) == 0) {
            count ++;
            list.remove(i);
            i--;
        }
    }
    for (int j = 0; j < count; j++) {
        list.add(0,0);
    }
    return list;
  }
}