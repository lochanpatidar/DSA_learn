package LinkedList;
class Node{
    int data;//value of current node
    Node next;//store adress of next node
//make a constructor
Node (int data){
    this.data=data;
    this.next=null;
 }
}
public class NodeOfLinkedlist{
public static void main(String[] args) {
    //10->20->30->40
    Node a=new Node(10);//write another way- a.data=10;
    Node b=new Node(20);
    Node c=new Node(30);
    Node d=new Node(40);
    Node head=a;
    //store the next node address 
    a.next=b;
    b.next=c;
    c.next=d;
   Node temp=head;
    while(temp!=null){
        System.err.println(temp.data);//print the value of each node
        temp=temp.next;
        System.err.println(temp);//print the adress of next node
    }
}
}
