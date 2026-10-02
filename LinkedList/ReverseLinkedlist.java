package LinkedList;
class Node{
    int data;
    Node next;
 Node(int data){
    this.data=data;
    this.next=null;
 }
}
public class ReverseLinkedlist{
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(6);
        Node head=a;
        a.next=b;
        b.next=c;
        System.err.println("original Linkedlist");
       Node temp=head;
       while (temp!=null) {
        System.err.println(temp.data);
        temp=temp.next;
       }
       //reverse a Linkedlist
       Node prev=null;
       Node curr=head;
       while(curr!=null){
        Node next=curr.next;//save next node
        curr.next=prev; //reverse the link
        prev=curr;   //move prev forwad
        curr=next;  //move curr forward
       }
       //new head
       head=prev;
       //print reverse linkedlist
       System.out.println("Reversed Linked List:");
       temp=head;
       while(temp!=null){
        System.err.print(temp.data +" ");
        temp=temp.next;
       }

    }
}