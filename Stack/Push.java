package Stack;

public class Push {
    static void push(int value) {
        if (top == 4) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed");
        }
    }
    static void display() {
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}     
 public static  void main(String[] args){
    push(20);
    display();
 }