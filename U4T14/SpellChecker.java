import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpellChecker {
  private ArrayList<String> dictionary;

  public SpellChecker() {
    dictionary = new ArrayList<String>();
    importDictionary();
  }

  public ArrayList<String> getDictionary() {
    return dictionary;
  }

  /** This uses LINEAR search to find a word in dictionary and returns
   * true if the word is in dictionary and false otherwise.
   *
   * It also tracks the number of words checked (loop iterations) and
   * prints that value out before returning.
   */
  public boolean linearSpellCheck(String word) {
    int loopCounter = 0; // for testing
    for (String s : dictionary) {
      loopCounter++; // for testing
      if (word.equals(s)) {
        System.out.println("-- LINEAR SEARCH: Number of words checked (loop iterations): " + loopCounter);
        return true;
      }
    }
    System.out.println("-- LINEAR SEARCH: Number of words checked (loop iterations): " + loopCounter);
    return false;
  }

  /** This uses BINARY search to find a word in dictionary and returns
   * true if the word is in dictionary and false otherwise.
   *
   * It also tracks the number of words checked (loop iterations) and
   * prints that value out before returning.
   */
  public boolean binarySpellCheck(String word) {
    int loopCounter = 0; // for testing

    int leftIdx = 0;  // assign this initial value
    int rightIdx = dictionary.size() - 1;  // assign this initial value

    while (leftIdx <= rightIdx) { // determine this condition (hint: see slides 61-63)
      loopCounter++; // for testing
      int middleIdx = (leftIdx + rightIdx) / 2; // determine what this should be
        
      //  rite the rest of the code to compare middleIdx to the target
        if (dictionary.get(middleIdx).equals(word)) {
          System.out.println(loopCounter);
            return true;
        } else if (dictionary.get(middleIdx).compareTo(word) > 0) {
            rightIdx = middleIdx - 1;
        } else {
            leftIdx = middleIdx + 1;
        }
      // and adjust leftIdx and rightIdx as appropriate (see slides if needed)
    }
    System.out.println(loopCounter);
    return false; // not found
  }

  // private helper method, called in the constructor, which loads the words
  // from the dictionary.txt text file into the "dictionary" instance variable!
  private void importDictionary() {
    try {
      File myFile = new File("/workspaces/unit-1-objects-and-methods-kaited335/U4T14/dictionary.txt");
      Scanner fileScanner = new Scanner(myFile);
      while (fileScanner.hasNext()) {
        String data = fileScanner.nextLine();
        dictionary.add(data);
      }
      System.out.println("\ndictionary.txt file imported successfully!");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
