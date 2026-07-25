package String;
import java.util.Scanner;
public class LastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        if (str.length() > 0) {
            char lastChar = str.charAt(str.length() - 1);
            System.out.println("Last Character: " + lastChar);
        } else {
            System.out.println("String is empty.");
        }
        sc.close();
    }
}
