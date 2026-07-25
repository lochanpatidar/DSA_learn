package String;
import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char remove = sc.next().charAt(0);
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != remove) {
                result += ch;
            }
        }
        System.out.println("Updated String: " + result);
        sc.close();
    }
}
