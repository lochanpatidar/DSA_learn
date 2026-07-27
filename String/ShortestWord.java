package String;
    import java.util.Scanner;
public class ShortestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        System.out.println("Shortest Word: " + shortest);
        sc.close();
    }
}
