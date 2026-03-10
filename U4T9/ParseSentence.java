import java.util.ArrayList;

public class ParseSentence {

  public ParseSentence() {}

  public ArrayList<String> parseSentence(String sentence) {
        ArrayList<String> wordList = new ArrayList<String>();
        if (sentence.equals("")) {
            return wordList;
        }
        int count = 0;
        int start = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.substring(i, i + 1).equals(" ")) {
                wordList.add(sentence.substring(start, start + count));
                count = 0;
                start = i;
            } else {
                count ++;
            }
            if (i == sentence.length() - 1) {
                wordList.add(sentence.substring(start, start + count));
            }
        }
        return wordList;
  }
}