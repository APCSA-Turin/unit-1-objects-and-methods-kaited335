import java.util.ArrayList;


public class DuplicateUpperEnd {

 public DuplicateUpperEnd() {}

 public ArrayList<String> duplicateUpperEnd(ArrayList<String> wordList) {
  ArrayList<String> upper = new ArrayList<String>();
   for (int i = 0; i < wordList.size(); i++) {
    upper.add(wordList.get(i).toUpperCase());
  }
  for (int j = 0; j < upper.size(); j++) {
    wordList.add(upper.get(j));
  }
  return wordList;
 }
}