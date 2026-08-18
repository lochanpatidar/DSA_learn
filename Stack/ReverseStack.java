package Stack;

public class ReverseStack {
    int[] arr = new int[5];
    int top = -1;
    // Push
    void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack is Full");
        } else {
            arr[++top] = value;
        }
    }
    // Pop
    int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return arr[top--];
        }
    }
    // Reverse Stack
    void reverse() {
        int i = 0;
        int j = top;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    // Display
    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        ReverseStack s = new ReverseStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Original Stack:");
        s.display();
        s.reverse();
        System.out.println("Reversed Stack:");
        s.display();
    }
}
