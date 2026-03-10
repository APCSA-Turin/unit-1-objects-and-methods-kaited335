import java.util.ArrayList;

public class InsertAfterI {

  public InsertAfterI() {}

  public void insertAfterI(ArrayList<String> stringList, String str) {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i). contains("i") || stringList.get(i). contains("I")) {
                stringList.add(i + 1, str);
                i++;
            }
        }
  }
}