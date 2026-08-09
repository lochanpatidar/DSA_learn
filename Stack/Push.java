package Stack;

public class Push {
    int[] arr = new int[5];
    int top = -1;
    // Push operation
    void push(int value) {
        if (top == 4) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = value;
            System.out.println(value + " pushed");
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
    }
}