package String;
import java.util.Arrays;
import java.util.Scanner;

public class GroupAnagrams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Words: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {

            if (visited[i])
                continue;

            visited[i] = true;
            System.out.print(words[i] + " ");

            char[] a = words[i].toCharArray();
            Arrays.sort(a);

            for (int j = i + 1; j < n; j++) {

                if (visited[j])
                    continue;

                char[] b = words[j].toCharArray();
                Arrays.sort(b);

                if (Arrays.equals(a, b)) {

                    System.out.print(words[j] + " ");
                    visited[j] = true;

                }
            }

            System.out.println();
        }

        sc.close();
    }
}
