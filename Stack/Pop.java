package Stack;

public class Pop {
     static void pop() {
        if (top == -1) {
            System.out.println("Stack of Underflow");
        } else {
            System.out.println(stack[top] + " popped");
            top--;
        }
    }
   public static void main(String[] args) {
     
   } 
}
