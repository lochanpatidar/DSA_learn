package String;
    import java.util.Scanner;
public class RemoveExtraSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String result = str.trim().replaceAll("\\s+", " ");
        System.out.println("Result: " + result);
        sc.close();
    }
}
