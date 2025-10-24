package U1T11;
import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int wordCount = 1;
        System.out.print("Enter the first word: ");
        String str1 = scan.nextLine();

        while(score < 50) {
            System.out.print("Enter next word: ");
            String str2 = scan.nextLine();
            if (str1.compareTo(str2) < 0) {
                score = score + 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            } else {
                if (str1.compareTo(str2) > 0) {
                    score =  score - 5;
                    System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
                } else {
                    score = score - 10;
                    System.out.println("-10 points: current word is the exact same as previous word; SCORE: " + score);
                }
            }
            int index = str1.length() - 2;
            if ((str1.substring(index, str1.length())).equals(str2.substring(0, 2)) == true) {
                score = score + 5;
                System.out.println("+5 points: last 2 letters of previous match first 2 letters of current; SCORE: " + score);
            }
            if (str2.indexOf(str1.substring(0,1)) > -1) {
                score = score + 3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }
            str1 = str2;
            wordCount ++;
        }
        System.out.println("You win! It took you " + wordCount + " words! Try again for a lower word count :)");
        scan.close();
    }
}
