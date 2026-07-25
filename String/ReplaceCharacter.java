package String;
import java.util.Scanner;
public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == oldChar) {
                result += newChar;
            } else {
                result += ch;
            }
        }
        System.out.println("Updated String: " + result);

        sc.close();
    }
}
