package String;
    import java.util.Scanner;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String str = sc.nextLine();
        System.out.print("Old Word: ");
        String oldWord = sc.nextLine();
        System.out.print("New Word: ");
        String newWord = sc.nextLine();
        String result = str.replace(oldWord, newWord);
        System.out.println("Updated Sentence: " + result);
        sc.close();
    }
}
