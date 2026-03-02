public class duplicates {

    public duplicates(){}

    public boolean hasDuplicates(int[] numList) {
        for (int i = 0; i < numList.length; i++) {
            int compare = numList[i];
            for (int j = i + 1; j < numList.length; j++) {
                if (numList[j] == compare) {
                    return true;
                }
            }
        }
        return false;
    }
}