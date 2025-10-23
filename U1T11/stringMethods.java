package U1T11;
import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = scan.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = scan.nextLine();
        if (str1.equals(str2) == true) {
            System.out.println("The strings are equal!");
        } else {
            System.out.println("The strings are NOT equal!");
            scan.close();
        }
    }
}
