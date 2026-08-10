package Stack;

public class StackFirst {
    static int[] stack = new int[5];
    static int top = -1;
    // Push operation
    static void push(int value) {
        if (top == 4) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed");
        }
    }
    static void pop() {
        if (top == -1) {
            System.out.println("Stack of Underflow");
        } else {
            System.out.println(stack[top] + " popped");
            top--;
        }
    }
    static void display() {
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        display();
        pop();
        display();
    }
}
