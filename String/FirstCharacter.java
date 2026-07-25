package String;
import java.util.Scanner;
public class FirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        if (str.length() > 0) {
            char firstChar = str.charAt(0);
            System.out.println("First Character: " + firstChar);
        } else {
            System.out.println("String is empty.");
        }
        sc.close();
    }
}
