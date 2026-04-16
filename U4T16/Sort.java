package U4T16;
import java.util.ArrayList;

public class Sort {

    // PART A. implementing insertion sort
    public static void insertionSort(int[] elements) {
        //Part A: implement me using an outer FOR loop and an inner WHILE loop
        for (int i = 1; i < elements.length; i++) {  // iterate through list starting at index 1
            int current = elements[i];
            int index = i;
            // store current element's value
            // set inner loop's index to outer loop's current index

            while (index > 0 && current < elements[index - 1]) {  // continue checking values to the left until you either reach
                              // the front (index 0) of the list or you get to a value that is less
                              // than the current element
                elements[index] = elements[index - 1];
                index--;
                // shift the element directly to the left to the right,
                // then adjust inner loop index to the left one index
            }
            elements[index] = current;
            // insert current element into the correct index
        }
    }

    // PART B. sorting a word list
    public static void insertionSortWordList(ArrayList<String> words) {
        int iterations = 0;
        for (int i = 1; i < words.size(); i++) {  
            String current = words.get(i);
            int index = i;

            while (index > 0 && current.compareTo(words.get(index - 1)) < 0){  
                words.set(index, words.get(index - 1));
                index--;
                iterations ++;
            }
            words.set(index, current);
            iterations++;
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + iterations);
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        int iterations = 0;
    for (int i = 0; i < words.size(); i++) {
      int minIdx = i;
      String min = "zzzzzzzzzzzz";
      for (int j = i; j < words.size(); j++) {
        if (words.get(j).compareTo(min) < -1) {
          minIdx = j;
          min = words.get(j);
        }
        iterations++;
      }
      String temp = words.get(i);
      words.add(i, words.get(minIdx));
      words.add(minIdx, temp);
      iterations++;
    }
    System.out.println("SELECTION SORT: Number of loop iterations: " + iterations);
  }
}
