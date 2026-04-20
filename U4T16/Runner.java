package U4T16;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        System.out.println();
        int[] arrB = {8, 10, 7, 16, 3, 12, 5, 2, 13, 4, 15, 9, 6, 1, 14, 11};
        Sort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));
    }
}
