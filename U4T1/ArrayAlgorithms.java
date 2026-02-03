public class ArrayAlgorithms {
    
    private ArrayAlgorithms() {

    }

    public static double average(int[] numList) {
        double average = 0.0;
        for (int i = 0; i < numList.length; i++) {
            average += numList[i];
        }
        average = average / numList.length;
        return average;
  }

  public static int minimum(int[] numList) {
    int minimum = numList[0];
    for (int i = 1; i < numList.length; i++) {
            if (numList[i] < minimum) {
                minimum = numList[i];
            }
        }
    return minimum;
  }

  public static int howManyContain(String[] strList, String target) {
    int words = 0;
    for (int i = 0; i < strList.length; i++) {
            if (strList[i].indexOf(target) > -1) {
                words ++;
            }
        }
    return words;
  }

  public static String[] stringToArray(String myStr) {
    String[] array = new String[myStr.length()];
    for (int i = 0; i < myStr.length(); i++) {
        array[i] = myStr.substring(i, i + 1);
    }
    return array;
  }

  public static void introduceAdults(Person[] people) {
    for (int i = 0; i < people.length; i++) {
        if (people[i].getAge() >= 18) {
            people[i].introduce();
        }
    }
  }

  public static void reversePrint(String[] wordList) {
    for (int i = wordList.length - 1 ; i>= 0; i--) {
        String backwards = "";
        String word = wordList[i];
        for (int j = word.length() - 1 ; j >= 0; j--) {
            backwards += word.substring(j, j + 1);
        }
        System.out.println(backwards);
    }
  }

  public static int[] combine(int[] arr1, int[] arr2) {
    int[] combined = new int[arr1.length + arr2.length];
    for (int i = 0; i < arr1.length; i++) {
        combined[i] = arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
        combined[i+arr1.length] = arr2[i];
    }
    return combined;
  }  

  public static void bookEnd(int[] nums, int num) {
      for (int i = 0; i < nums.length; i++) {
        if (i == 0) {
            nums[i] = num;
        }
        if (i == nums.length - 1) {
            nums[i] = num;
        }
      }
  }

  public static void multiplyBy(int[] numList, int multiplier) {
    for (int i = 0; i < numList.length; i++) {
        numList[i] = numList[i] * multiplier;
    }
  }

  public static int[] multiplyByNoModify(int[] numList, int multiplier) {
    int[] nums = new int[numList.length];
    for (int i = 0; i < numList.length; i++) {
        nums[i] = numList[i] * multiplier;
    }
    return nums;
  }

  public static void addExclamation(String[] wordList) {
    for (int i = 0; i < wordList.length; i++) {
        String end  = wordList[i].substring(wordList[i].length() - 1);
        if ( end.equals("!")) {

        } else {
            wordList[i] = wordList[i] + "!";
        }
    }
  }

  public static boolean[] isFreezing(int[] tempList) {
    boolean[] isTrue = new boolean[tempList.length];
    for (int i = 0; i < tempList.length; i++) {
        if (tempList[i] <= 32) {
            isTrue[i] = true;
        } else {
            isTrue[i] = false;
        }
    }
    return isTrue;
  }

  public static void shiftLeft(int[] numList) {
     int temp = numList[0];
     for (int i = 0; i < numList.length; i++) {
        if (i == numList.length - 1) {
            numList[i] = temp;
        } else {
            numList[i] = numList[i + 1];
        }
     }
  }

  public static void shiftRight(int[] numList) {
    int temp = numList[numList.length - 1]; 
    for (int i = numList.length - 1; i > -1; i--) {
        if  (i == 0) {
            numList[i] = temp;
        } else {
            numList[i] = numList[i - 1];
        }
    }
  }

  public static void reverse(int[] numList) { 
    for (int i = 0; i < numList.length / 2; i++) {
        int temp = numList[numList.length - 1 - i];
        numList[numList.length - 1 - i] = numList[i];
        numList[i] = temp;
    }
}
}
