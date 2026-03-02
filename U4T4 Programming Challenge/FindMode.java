public class FindMode{

    public FindMode(){}

    public int mode(int[] numList) {
        int real_min = Integer.MAX_VALUE;
        for (int num : numList) {
            if (num < real_min) {
                real_min = num;
            }
        }
        int maxCount = 1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numList.length; i++) {
            int count = 0;
            int number = numList[i];
            for (int nums : numList) {
                if (number == nums) {
                    count++;
                }
            }
            if (count >= maxCount) {
                if ( count == maxCount) {
                    min = numList[i];
                }
                maxCount = count;
            }

        }
        if (maxCount == 1) {
            return real_min;
        } else {
            return min;
        }
    }
}