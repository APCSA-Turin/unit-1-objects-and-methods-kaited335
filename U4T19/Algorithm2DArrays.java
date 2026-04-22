import java.util.ArrayList;

public class Algorithm2DArrays {

  public static int sumForRow(int[][] arr, int row) {
    int sum = 0;
    for (int i = 0; i < arr[row].length; i++) {
        sum += arr[row][i];
    }
    return sum;
  }

  public static int sumForColumn(int[][] arr, int col) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i][col];
    }
    return sum;
  }

  public static int replaceEvensWithZero(int[][] arr) {
    int changed = 0;
    for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            if (arr[row][col] % 2 == 0) {
                arr[row][col] = 0;
                changed ++;
            }
        }
    }
    return changed;
  }

  public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len) {
    ArrayList<String> words = new ArrayList<String>();
    for (int row = 0; row < wordChart.length; row++) {
        for (int col = 0; col < wordChart[row].length; col++) {
            if (wordChart[row][col].length() == len) {
                words.add(wordChart[row][col]);
            }
        }
    }
    return words;
  }

  public static double classAverage(Student[][] seatingChart) {
    int studentCount = 0;
    int sum = 0;
    for (int row = 0; row < seatingChart.length; row++) {
        for (int col = 0; col < seatingChart[row].length; col++) {
            sum += seatingChart[row][col].getGrade();
            studentCount++;
        }
    }
    return sum / studentCount;
  }

  public static boolean consecutive(int[][] arr) {
    for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length - 1; col++) {
            if (arr[row][col] == arr[row][col + 1]) {
                return true;
            }
        }
    }
    for (int row = 0; row < arr.length - 1; row++) {
        for (int col = 0; col < arr[row].length - 1; col++) {
            if (arr[row][col] == arr[row + 1][col]) {
                return true;
            }
        }
    }
    return false;
  }

  public static boolean magicSquare(int[][] arr) {
    ArrayList<Integer> unique = new ArrayList<Integer>();
    unique.add(arr[0][0]);
    for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            for (int i = 0; i < unique.size(); i++) {
                if (col == 0 && row == 0) {

                } else if (unique.get(i) == arr[row][col]) {
                    return false;
                } else {
                    unique.add(arr[row][col]);
                }
            }
        }
    }

    int sum = 0;
    for (int j = 0; j < arr[0].length; j++) {
        sum += arr[0][j];
    }

    for (int row = 1; row < arr.length; row++) {
        int compare = 0;
        for (int col = 0; col < arr[0].length; col++) {
            compare += arr[row][col];
        }
        if (sum != compare) {
            return false;
        }
    }

    for (int col = 0; col < arr[0].length; col++) {
        int compare = 0;
        for (int row = 0; row < arr.length; row++) {
            compare += arr[row][col];
        }
        if (sum != compare) {
            return false;
        }
    }

    for (int row = 0; row < arr.length; row++) {
        int compare = 0;
        for (int col = 0; col < arr[0].length; col++) {
            if (row == col) {
                compare += arr[row][col];
            }
        }
        if (sum != compare) {
            return false;
        }
    }
    for (int row = 0; row < arr.length; row++) {
        int compare = 0;
        for (int col = 0; col < arr[0].length; col++) {
            if (row + col == arr.length - 1) {
                compare += arr[row][col];
            }
        }
        if (sum != compare) {
            return false;
        }
    }
    return true;
  }
}