package Linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Indexfind{
    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node head=a;
       a.next=b;
       b.next=c;
       Node temp=head;
       while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
        Node prev=null;
        Node curr=head;
        
       }

    }
}
