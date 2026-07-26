package String;
    import java.util.Scanner;
public class SearchWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter Word: ");
        String word = sc.nextLine();
        String[] words = sentence.split(" ");
        boolean found = false;
        for (String w : words) {
            if (w.equals(word)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Word Found");
        } else {
            System.out.println("Word Not Found");
        }
        sc.close();
    }
}
