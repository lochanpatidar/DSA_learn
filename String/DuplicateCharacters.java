package String;
import java.util.Scanner;
public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        System.out.println("Duplicate Characters:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                continue;
            }
            boolean duplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    arr[j] = '0';      // Mark duplicate
                }
            }
            if (duplicate) {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
