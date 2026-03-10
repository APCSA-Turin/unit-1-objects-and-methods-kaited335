import java.util.ArrayList;

public class ReverseArray {

  public ReverseArray() {}

  public ArrayList<Integer> reverseArray(int[] intList) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < intList.length; i++) {
            arrayList.add(0, intList[i]);
        }
        return arrayList;
  }
}