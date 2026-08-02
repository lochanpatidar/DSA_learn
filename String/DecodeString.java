package String;
    import java.util.Scanner;
import java.util.Stack;
public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Encoded String: ");
        String s = sc.nextLine();
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String current = "";
        int number = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(number);
                stringStack.push(current);
                number = 0;
                current = "";
            } else if (ch == ']') {
                int repeat = countStack.pop();
                String temp = current;
                current = stringStack.pop();
                while (repeat-- > 0)
                    current += temp;
            } else {
                current += ch;
            }
        }
        System.out.println(current);
        sc.close();
    }
}
