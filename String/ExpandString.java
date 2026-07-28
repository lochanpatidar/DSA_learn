package String;
    import java.util.Scanner;
public class ExpandString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            char ch = str.charAt(i);
            int count = str.charAt(i + 1) - '0';
            for (int j = 1; j <= count; j++)
                result += ch;
        }
        System.out.println("expand string: " +result);
        sc.close();
    }
}
