package String;
    import java.util.Scanner;
public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second String: ");
        String str2 = sc.nextLine();
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Both Strings are Equal");
        } else if (result > 0) {
            System.out.println(str1 + " is Greater");
        } else {
            System.out.println(str2 + " is Greater");
        }
        sc.close();
    }
}
