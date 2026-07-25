package String;
import java.util.Scanner;
public class CharacterExists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter character to search: ");
        char search = sc.next().charAt(0);
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == search) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Character found.");
        } else {
            System.out.println("Character not found.");
        }
        sc.close();
    }
}
