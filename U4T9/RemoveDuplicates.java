import java.util.ArrayList;

public class RemoveDuplicates {

  public RemoveDuplicates() {}

  public void removeDuplicates(ArrayList<Integer> intList) {
        ArrayList<Integer> unique = new ArrayList<Integer>();

        for (int i = 0; i < intList.size(); i++) {
            if (unique.size() == 0) {
                unique.add(intList.get(i));
            } else {
                for (int j = 0; j < unique.size(); j++) {
                    if (intList.get(i) == unique.get(j)) {
                        intList.remove(i);
                        i--;
                        break;
                    } else {
                        unique.add(intList.get(i));
                    }
                }
            }
        }
  }
}