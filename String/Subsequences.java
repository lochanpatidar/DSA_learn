package String;
   import java.util.Scanner;
public class Subsequences {
    static void generate(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        generate(str.substring(1), ans + ch);
        generate(str.substring(1), ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        generate(str, "");
        sc.close();
    } 
}
