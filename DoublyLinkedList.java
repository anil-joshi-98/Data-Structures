import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
class Doubly{
    void insertion(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            temp.left=null;
            temp.right=null;
            head=temp;
            return;
        }
        Node t=head;
        while(t.right!=null){
            t=t.right;
        }
        temp.left=t;
        temp.right=null;
        t.right=temp;
    }
    void display(Node head){
        Node temp=head;
        if(head==null){
            System.out.println("empty Linkedlist");
            return;
        }
        do{
            System.out.println(temp.data);
            temp=temp.right;
        }while(temp!=null);
    }
    Node firstInsert(Node head,int data){
        head=new Node(data);
        head.left=null;
        head.right=null;    
        return head;
    }
}
class DoublyLinkedList{
    public static void main(String[] args){
    Node head=null;
    Doubly db=new Doubly();
    head=db.firstInsert(head,32);
    db.insertion(head,12);
    db.insertion(head,23);
    db.insertion(head,34);
    db.insertion(head,44);
    db.insertion(head,55);
    db.display(head);
    }
}