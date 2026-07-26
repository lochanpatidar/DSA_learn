package String;
    import java.util.Scanner;
public class ExtractSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter Start Index: ");
        int start = sc.nextInt();
        System.out.print("Enter End Index: ");
        int end = sc.nextInt();
        System.out.println("Substring: " + str.substring(start, end));
        sc.close();
    }
}
