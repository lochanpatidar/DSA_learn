package Stack;
    import java.util.Stack;
class BalancedParentheses {
    static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                // Check matching brackets
                if (ch == ')' && top != '(' ||
                    ch == '}' && top != '{' ||
                    ch == ']' && top != '[') {
                    return false;
                }
            }
        }
        // Stack must be empty
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "{[()]}";
        if (isBalanced(str)) {
            System.out.println("Parentheses are Balanced");
        } else {
            System.out.println("Parentheses are Not Balanced");
        }
    }
}
