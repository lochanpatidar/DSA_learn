package String;
import java.util.Scanner;
public class LeastFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        char result = ' ';
        int min = str.length();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j))
                    count++;

            }
            if (count < min) {

                min = count;
                result = str.charAt(i);
            }
        }
        System.out.println(result + " = " + min);

        sc.close();
    }
}
