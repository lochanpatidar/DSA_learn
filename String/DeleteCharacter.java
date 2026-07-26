package String;
    import java.util.Scanner;
public class DeleteCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();
        String result = str.substring(0, pos) + str.substring(pos + 1);
        System.out.println("Updated String: " + result);
        sc.close();
    }
}
