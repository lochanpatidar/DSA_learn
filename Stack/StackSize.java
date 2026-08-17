package Stack;

public class StackSize {
    int[] arr = new int[5];
    int top = -1;
    // Push operation
    void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack is Full");
        } else {
            arr[++top] = value;
        }
    }
    // Find size
    int size() {
        return top + 1;
    }
    public static void main(String[] args) {
        StackSize s = new StackSize();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Size of Stack = " + s.size());
    }
}
