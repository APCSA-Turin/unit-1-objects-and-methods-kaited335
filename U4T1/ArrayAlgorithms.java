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
}
