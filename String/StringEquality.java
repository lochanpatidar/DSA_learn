package String;
    import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second String: ");
        String str2 = sc.nextLine();
        boolean equal = true;
        if (str1.length() != str2.length()) {
            equal = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        }
        if (equal) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are Not Equal");
        }
        sc.close();
    }
}
