package Stack;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}
class Stack {
    Node top = null;
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    void pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            top = top.next;
        }
    }
    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top: " + top.data);
        }
    }
    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class StackUsingLinkedlist {
       public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(60);
        System.out.println("Stack Elements:");
        s.display();
        s.peek();
        s.pop();
        System.out.println("After Pop:");
        s.display();
        s.push(50);
        s.push(70);
        System.out.println("After Push:");
        s.display();
    } 
}
