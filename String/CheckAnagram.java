package String;
    import java.util.Arrays;
import java.util.Scanner;
public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.print("Enter second String: ");
        String str2 = sc.nextLine().toLowerCase();
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            System.out.println("Anagram ");
        } else {
            System.out.println("Not Anagram");
        }
        sc.close();
    }
}
