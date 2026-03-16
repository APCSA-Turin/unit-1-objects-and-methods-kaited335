import java.util.ArrayList;

public class SameFirstLast {
  public SameFirstLast() {}

  public boolean sameFirstLast(ArrayList<Integer> list) {
    if (list == null) {
        return false;
    }
    if (list.size() == 0) {
        return false;
    }
    if ( list.get(0) == null || list.get(list.size() - 1) == null) {
        if ( list.get(0) == null && list.get(list.size() - 1) == null) {
            return true;
        } else {
            return false;
        }
    }
    if (list.size() == 0) {
        return false;
    }
    if (list.get(0).equals(list.get(list.size() - 1))) {
        return true;
    } else {
        return false;
    }
  }
}
