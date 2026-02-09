
public class Main {
    public static void main(String[] args) {
        int[] nums = {6, 1, 3, 4, 7, 5};

ArrayAlgorithms.shiftRight(nums);

// original nums array IS modified; all elements shifted right 1

for (int i = 0; i < nums.length; i++) {

    System.out.print(nums[i] + " ");

}

System.out.println();

int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8};

ArrayAlgorithms.shiftRight(nums2);

// original nums2 array IS modified; all elements shifted right 1

for (int i = 0; i < nums2.length; i++) {

    System.out.print(nums2[i] + " ");

}

System.out.println();

// shift nums2 AGAIN:

ArrayAlgorithms.shiftRight(nums2);

for (int i = 0; i < nums2.length; i++) {

    System.out.print(nums2[i] + " ");

}

System.out.println();

// shift nums2 A THIRD TIME:

ArrayAlgorithms.shiftRight(nums2);

for (int i = 0; i < nums2.length; i++) {

    System.out.print(nums2[i] + " ");

}

    }
}
