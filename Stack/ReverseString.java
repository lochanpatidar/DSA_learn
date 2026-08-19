package Stack;
import java.util.Stack;
class ReverseString {
    public static void main(String[] args) {
        String str = "HELLO";
        Stack<Character> stack = new Stack<>();
        // Push characters into Stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        // Pop characters to reverse
        String reverse = "";
        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse);
    }
}
