package String;
    import java.util.Scanner;
public class LinearSearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter Character to Search: ");
        char key = sc.next().charAt(0);
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == key) {
                System.out.println("Character Found at Index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Character Not Found");
        }
        sc.close();
    }
}
