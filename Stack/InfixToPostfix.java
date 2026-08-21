package Stack;
    import java.util.Stack;
class InfixToPostfix {
    static int priority(char ch) {
        if (ch == '^')
            return 3;
        if (ch == '*' || ch == '/' || ch == '%')
            return 2;
        if (ch == '+' || ch == '-')
            return 1;
        return 0;
    }
    static String convert(String infix) {
        Stack<Character> stack = new Stack<>();
        String postfix = "";
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            // Operand
            if (Character.isLetterOrDigit(ch)) {
                postfix = postfix + ch;
            }
            // Opening bracket
            else if (ch == '(') {
                stack.push(ch);
            }
            // Closing bracket
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix = postfix + stack.pop();
                }
                stack.pop(); // Remove '('
            }
            // Operator
            else {
                while (!stack.isEmpty()
                        && priority(stack.peek()) >= priority(ch)) {

                    postfix = postfix + stack.pop();
                }
                stack.push(ch);
            }
        }
        // Pop remaining operators
        while (!stack.isEmpty()) {
            postfix = postfix + stack.pop();
        }
        return postfix;
    }
    public static void main(String[] args) {
        String infix = "A+B*C";
        String postfix = convert(infix);
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);
    }
}
