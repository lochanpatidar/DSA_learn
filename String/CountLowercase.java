package String;
 import java.util.Scanner;
public class CountLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int count = 0;
        System.out.print("Lower case letter: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println(ch+ " ");
                count++;
            }
        }
        System.out.println("Number of Lowercase Letters: " + count);
        sc.close();
    }
}

