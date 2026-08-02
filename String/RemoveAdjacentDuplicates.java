package String;
    import java.util.Scanner;
import java.util.Stack;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch)
                stack.pop();
            else
                stack.push(ch);

        }

        StringBuilder result = new StringBuilder();

        for (char ch : stack)
            result.append(ch);

        System.out.println(result);

        sc.close();
    }

}
