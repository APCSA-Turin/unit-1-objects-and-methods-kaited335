package U1T11;
import java.util.Scanner;

public class stringLength {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter first string: ");
      String str1 = scan.nextLine();
      System.out.print("Enter second string: ");
      String str2 = scan.nextLine();
      if (str1.length() > str2.length()) {
        System.out.println(str1 + " is longer");
      } else {
        System.out.println(str2 + " is longer");
      }
      int halfLen1 = str1.length()/2; 
      int halfLen2 = str2.length()/2;
      System.out.println("First half: " + str1.substring(0,halfLen1));
      System.out.println("Second half: " + str1.substring(halfLen1));
      System.out.println("First half: " + str2.substring(0,halfLen2));
      System.out.println("Second half: " + str2.substring(halfLen2));
      if (str1.indexOf(str2) == -1) {
        System.out.println(str2 + " was NOT found in " + str1);
      } else {
        System.out.println(str2 + " was found in " + str1 + " at index " + str1.indexOf(str2));
      }
    }
}
