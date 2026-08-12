package Stack;

public class Stack {

    int[] stack = new int[5];
    int top = -1;

    // Push operation
    void push(int value) {
        top++;
        stack[top] = value;
    }

    // Peek operation
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.peek();
    }
}
