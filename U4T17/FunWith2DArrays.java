import java.util.Arrays;

public class FunWith2DArrays {
    public static int totalElements(int[][] array) {
        int count = 0;
        for (int[] row : array) {
            for (int element : row) {
                count++;
            }
        }
        return count;
    }
    
    public static void fourCorners(String[][] array) {
        System.out.println(array[0][0]);
        System.out.println(array[0][array.length - 1]);
        System.out.println(array[array[0].length - 1] [0]);
        System.out.println(array[array[0].length - 1] [array.length - 1]);
    }

    public static void swapFrontAndBackRows(String[][] array) {
        String[] temp = array[0];
        array[0] = array[array[0].length - 1];
        array[array[0].length - 1] = temp;
    }

    public static double average(int[][] array) {
        double average = 0;
        for (int[] row : array) {
            for (int element : row) {
                average += element;
            }
        }
        return average / totalElements(array);
    }

    public static int edgeSum(int[][] array) {
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                if (row == 0 || row == array.length - 1) {
                    sum += array[row][col];
                } else if (col == 0 || col == array[0].length - 1) {
                    sum += array[row][col];
                }
            }
        }
        return sum;
    }

    public static int[] indexFound(String[][] array, String target) {
        int[] index = {-1, -1};
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j][i].equals(target)) {
                    index = {i, j};
                    return index;
                }
            }
        }
        return index;
    }

    public static int[][] split(int[][] array, int rowTarget, int columnTarget) {
        if (rowTarget > array.length || columnTarget > array[0].length) {
            return new int[0][0];
        }
        int[][] splitedArray = new int[rowTarget + 1][columnTarget + 1];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                if (row <= rowTarget && col <= columnTarget) {
                    splitedArray[row][col] = array[row][col]; 
                }
            }
        } 
        return splitedArray;
    }
    public static int[][] invert(int[][] array) {
        int[][] inverted = new int[array[0].length][array.length];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                inverted[col][row] = array[row][col];
            }
        }
        return inverted;
    }
}

