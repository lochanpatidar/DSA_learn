package String;
    import java.util.Scanner;
public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        System.out.println("First Occurrence: " + index);
        sc.close();
    }
}
