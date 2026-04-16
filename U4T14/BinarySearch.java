public class BinarySearch {

  // implements binary search on the elements list for target,
  // and returns the index at which the target is found, or -1 if
  public static int binarySearch(int[] elements, int target) {

    int loopCounter = 0; // for testing
    int leftIdx = 0;  // assign this initial value
    int rightIdx = elements.length - 1;  // assign this initial value
  

    while (leftIdx <= rightIdx) { // determine this condition (hint: see slides 61-63)
      loopCounter++; // for testing
      System.out.print(loopCounter + " "); // for testing
      int middleIdx = (leftIdx + rightIdx) / 2; // determine what this should be
        
      // write the rest of the code to compare middleIdx to the target
        if (elements[middleIdx] == target) {
            return middleIdx;
        } else if (elements[middleIdx] > target) {
            rightIdx = middleIdx - 1;
        } else {
            leftIdx = middleIdx + 1;
        }
      // and adjust leftIdx and rightIdx as appropriate (see slides if needed)
    }
    return -1; // not found
  }
}