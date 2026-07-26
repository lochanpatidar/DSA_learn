package String;
    import java.util.Scanner;
public class CopyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String copy = str;
        System.out.println("Copied String: " + copy);
        sc.close();
    }
}
