package U4T15;
import java.util.ArrayList;

public class Sort {
  // PART A. implementing selection sort
  public static void selectionSort(int[] elements) {
    for (int i = 0; i < elements.length; i++) {
      int minIdx = i;
      int min = Integer.MAX_VALUE;
      for (int j = i; j < elements.length; j++) {
        if (elements[j] < min) {
          minIdx = j;
          min = elements[j];
        }
      }
      int temp = elements[i];
      elements[i] = elements[minIdx];
      elements[minIdx] = temp;
    }
  }

  // PART B. sorting a 1000-word list
  public static void selectionSortWordList(ArrayList<String> words) {
    for (int i = 0; i < words.size(); i++) {
      int minIdx = i;
      String min = "zzzzzzzzzzzz";
      for (int j = i; j < words.size(); j++) {
        if (words.get(j).compareTo(min) < -1) {
          minIdx = j;
          min = words.get(j);
        }
      }
      String temp = words.get(i);
      words.add(i, words.get(minIdx));
      words.add(minIdx, temp);
    }
  }
}
