public class Main {
    public static void main(String[] args) {
        String[][] names = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Harry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};
        names[1][2] = "Paul";
        String temp = names[0][0];
        names[0][0] = names[2][3];
        names[2][3] = temp;
        String[] temp2 = names[0];
        names[0] = names[1];
        names[1] = temp2;
        for (String[] row : names) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        int[][] arr1 = new int[2][3];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        String[][] arr2 = new String[4][2];
        arr2[0][0] = "a";
        arr2[0][1] = "b";
        arr2[1][0] = "c";
        arr2[1][1] = "d";
        arr2[2][0] = "e";
        arr2[2][1] = "f";
        arr2[3][0] = "g";
        arr2[3][1] = "h";
        for (int[] row : arr1) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        for (String[] row : arr2) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}