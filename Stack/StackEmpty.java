package Stack;

public class StackEmpty {
    int[] arr = new int[5];
    int top = -1;
    boolean isEmpty() {
        return top == -1;
    }
    public static void main(String[] args) {
        StackEmpty s = new StackEmpty();

        if (s.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is Not Empty");
        }
    }
}
