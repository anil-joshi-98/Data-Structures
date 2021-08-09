import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class Circular{
    boolean insertion(Node head,int data){
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        Node temp1=new Node(data);
        temp.next=temp1;
        temp1.next=head;
        return true;
    }
    Node firstInsert(Node head,int data){
        head=new Node(data);
        head.next=head;
        return head;
    }
    void display(Node head){
        Node temp=head;
        if(head==null){
            System.out.println("empty Linkedlist");
            return;
        }
        do{
            System.out.print(temp.data+">>>");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("");
    }
    void delete(Node head){
        Node t=head;
        if(head==null) return;
        Node temp=head;
        do{
            if(head.data==43){
                break;
            }
            temp=head;
            head=head.next;
        }while(head!=t);
        temp.next=head.next;
    }
}
class CircularLinkedList{
    public static void main(String[] args){
        Circular ci=new Circular();
        Node head=null;
        head=ci.firstInsert(head,12);
        if(ci.insertion(head,53));
        System.out.println("done");
        if(ci.insertion(head,55));
        System.out.println("done");
        if(ci.insertion(head,43));
        System.out.println("done");
        if(ci.insertion(head,34));
        System.out.println("done");
        if(ci.insertion(head,33));
        System.out.println("done");
        ci.display(head);
        ci.delete(head);
        ci.display(head);
    }
}