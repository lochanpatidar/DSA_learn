package String;
import java.util.Scanner;
public class CountUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int count = 0;
        System.out.println("Upper Case: ") ;
           for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
             System.out.println(ch+ "");
                count++;
            }
        }
        System.out.println("Number of Uppercase Letters: " + count);
        sc.close();
    }
}

