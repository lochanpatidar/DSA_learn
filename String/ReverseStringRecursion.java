package String;
    import java.util.Scanner;
public class ReverseStringRecursion {
    static void reverse(String str) {
        if (str.length() == 0)
            return;
        System.out.print(str.charAt(str.length() - 1));
        reverse(str.substring(0, str.length() - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Reversed String: ");
        reverse(str);
        sc.close();
    }
}
