package String;
    import java.util.Arrays;
import java.util.Scanner;
public class SortWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        Arrays.sort(words);
        System.out.println("Sorted Words:");
        for (String word : words) {
            System.out.println(word);
        }
        sc.close();
    }
}
