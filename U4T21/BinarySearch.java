public class BinarySearch {

    // RECURSIVE IMPLEMENTATION
    public static int count = 0;
    public static int recursiveBinarySearch(int[] elements, int lowPosition, int highPosition, int target) {
        if (!(lowPosition == 0 && highPosition == elements.length - 1)) {
            count++;
        }
        if (lowPosition > highPosition) {
            System.out.println(count);
            return -1;  // base case: target was not found, return -1
        } else {
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                return recursiveBinarySearch(elements, midPosition + 1, highPosition, target);
            } else if (elements[midPosition] > target) {
                return recursiveBinarySearch(elements, lowPosition, midPosition - 1, target);
            } else {
                // otherwise, target found, return that index
                System.out.println(count);
                return midPosition;
            }
        }
    }

    
    // ITERATIVE, NON-RECURSIVE IMPLEMENTATION -- FOR COMPARISON
    public static int counter = 0;
    public static int iterativeNonRecursiveBinarySearch(int[] elements, int target) {
        int lowPosition = 0;
        int highPosition = elements.length - 1;

        while (lowPosition <= highPosition) {
            counter++;
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                lowPosition = midPosition + 1;
            } else if (elements[midPosition] > target) {
                highPosition = midPosition - 1;
            } else {
                System.out.println(counter);
                return midPosition;
            }
        }
        // target was not found, return -1
        System.out.println(counter);
        return -1;
    }
}
