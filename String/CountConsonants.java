package String;
import java.util.Scanner;
public class CountConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int count = 0;
        System.err.println("consonat word: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    System.err.println(ch+ "  ");
                    count++;
                    
                }
            }
        }
        System.out.println("Number of Consonants: " + count);
        sc.close();
    }
}

