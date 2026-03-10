import java.util.ArrayList;

public class DuplicateUpperEnd {

  public DuplicateUpperEnd() {}

  public void duplicateUpperEnd(ArrayList<String> wordList) {
      for (int i = 0; i < wordList.size(); i++) {
        if (wordList.get(i).equals(wordList.get(i).toUpperCase())) {
          break;
        } else {
          wordList.add(wordList.get(i).toUpperCase());
        }
      }
  }
}