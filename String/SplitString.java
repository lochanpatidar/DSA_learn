package String;
    import java.util.Scanner;
public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println("Words are:");
        for (String word : words) {
            System.out.println(word);
        }
        sc.close();
    }
}
