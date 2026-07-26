package String;
    import java.util.Scanner;
public class CompareIgnoringCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second String: ");
        String str2 = sc.nextLine();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are Equal(ignoring case):");
        } else {
            System.out.println("Strings are Not Equal");
        }
        sc.close();
    }
}

