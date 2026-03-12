import java.util.ArrayList;

public class RemoveDuplicates {

  public RemoveDuplicates() {}

  public ArrayList<Integer> removeDuplicates(ArrayList<Integer> intList) {
        ArrayList<Integer> unique = new ArrayList<Integer>();

        for (int i = 0; i < intList.size(); i++) {
            if (i == 0) {
                unique.add(intList.get(i));
            } else {
                int size = intList.size();
                for (int j = 0; j < unique.size(); j++) {
                    if (intList.get(i).equals(unique.get(j))) {
                        intList.remove(i);
                        i--;
                        break;
                    } 
                }
                if (size == intList.size()) {
                    unique.add(intList.get(i));
                }
            }
        }
        return intList;
  }
}