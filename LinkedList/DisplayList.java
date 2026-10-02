package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        //this.next=null;
    }
}
    public class DisplayList{
        public static void display(Node head){
            Node temp=head;
            while (temp!=null) {
                System.err.println(temp.data);
                temp=temp.next;
                System.err.println(temp);
            }
        }
        public static void main(String[] args) {
            Node a=new Node(10);
            Node b=new Node(20);
            Node c=new Node(30);
            a.next=b;
            b.next=c;
            display(a);
        }
    }
