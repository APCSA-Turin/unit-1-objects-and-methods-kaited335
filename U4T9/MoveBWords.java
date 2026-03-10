import java.util.ArrayList;

public class MoveBWords {

  public MoveBWords() {}

  public void moveBWords(ArrayList<String> wordList) {
        ArrayList<String> tempB = new ArrayList<String>();
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).substring(0, 1).equals("b") || wordList.get(i).substring(0,1).equals("B")) {
                String remove = wordList.remove(i);
                tempB.add(remove);
                i--;
            }
        }
        for (int j = 0; j < tempB.size(); j++) {
            wordList.add(j, tempB.get(j));
        }
  }
}
