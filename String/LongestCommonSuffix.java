package String;
    import java.util.Scanner;
public class LongestCommonSuffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        String suffix = arr[0];
        for (int i = 1; i < n; i++) {
            while (!arr[i].endsWith(suffix)) {
                suffix = suffix.substring(1);
            }
        }
        System.out.println("Longest Common Suffix: " + suffix);
        sc.close();
    }
}
