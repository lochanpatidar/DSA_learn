package String;
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("Length of String: " + length);
        sc.close();
    }
}
