package Stack;
import java.util.*;
class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int val) {
        s.push(val);
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
    }
    public void pop() {
        if (s.peek().equals(min.peek())) {
            min.pop();
        }
        s.pop();
    }
    public int top() {
        return s.peek();
    }
    public int getMin() {
        return min.peek();
    }
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);
        System.out.println("Minimum: " + obj.getMin());
        obj.pop();
        System.out.println("Top: " + obj.top());
        System.out.println("Minimum: " + obj.getMin());
    }
}