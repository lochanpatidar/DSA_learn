package String;
import java.util.Scanner;
public class CountSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int count = 0;
        System.out.println("special character: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.err.println(ch+ "");
                count++;
            }
        }
        System.out.println("Number of Special Characters: " + count);
        sc.close();
    }
}

