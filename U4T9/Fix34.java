import java.util.ArrayList;

public class Fix34 {
  public Fix34() {}

  public ArrayList<Integer> fix34(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) == 3) {
            boolean swapped = false;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == 4 && swapped == false) {
                    if (j == 0) {
                        if (i < j) {
                            list.remove(j);
                            list.add(i + 1, 4);
                            int num = list.remove(i + 2);
                            list.add(j, num);
                            swapped = true;
                        } else if (i > j) {
                            list.remove(j);
                            list.add(i, 4);
                            int num = list.remove(i + 1);
                            list.add(j, num);
                            swapped = true;
                        }

                    } else if (list. get(j - 1) == 3) {

                    } else {
                        if (i < j) {
                            list.remove(j);
                            list.add(i + 1, 4);
                            int num = list.remove(i + 2);
                            list.add(j - 1, num);
                            swapped = true;
                        } else if (i > j) {
                            list.remove(j);
                            list.add(i, 4);
                            int num = list.remove(i + 1);
                            list.add(j, num);
                            swapped = true;
                        }
                    }
                    
                }
            }
            if (swapped = false) {
                        list.add(i + 1, 4);
                    }
        }
    }
    return list;
  }
}
