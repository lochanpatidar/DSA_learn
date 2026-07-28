package String;
    import java.util.Scanner;
public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result += str.charAt(i - 1);
                result += count;
                count = 1;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
