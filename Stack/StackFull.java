package Stack;

public class StackFull {
    int[] arr = new int[5];
    int top = -1;
    boolean isFull() {
        return top == arr.length - 1;
    }
    public static void main(String[] args) {
        StackFull s = new StackFull();
        if (s.isFull()) {
            System.out.println("Stack is Full");
        } else {
            System.out.println("Stack is Not Full");
        }
    }
}
