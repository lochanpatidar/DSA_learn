package String;
    import java.util.Scanner;
public class InsertCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Character: ");
        char ch = sc.nextLine().charAt(0);
        String result = str.substring(0, pos) + ch + str.substring(pos);
        System.out.println("Updated String: " + result);
        sc.close();
    }
}
