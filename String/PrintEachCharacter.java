package String;
import java.util.Scanner;
public class PrintEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Characters are:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        sc.close();
    }
}

