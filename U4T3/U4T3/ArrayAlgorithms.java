package U4T3;
public class ArrayAlgorithms {

    public ArrayAlgorithms() {}

    public static String longestString(String[] stringList) {
        String longest = "";
        for (String word : stringList) {
            if (word.length() >= longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
    public static boolean containsPositive(int[] numList) {
        for (int num : numList) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }
}
