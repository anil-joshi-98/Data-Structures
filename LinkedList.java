import java.util.*;
class Operations{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    void insert(Node head,int data){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data);
        System.out.println("success!");
    }
    void delete(Node head,int data){
        Node temp=head;
        Node t=head;
        boolean flag=false;
        while(temp.next!=null){
            if(temp.data==data){
                flag=true;
                break;
            }
            t=temp;
            temp=temp.next;
        }
        t.next=temp.next;
    }
    void display(Node head){
        if(head==null)
        return;
        System.out.print(head.data+" ");
        display(head.next);
    }
}
class LinkedList{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Operations.Node head=null;
        Operations op=new Operations();
        int ch=0;
        while(ch!=4){
            System.out.printf("\nenter choices \n1.insert\n2.delete\n3.display\n4.exit\n");
            ch=in.nextInt();
            if(ch==1){
                    System.out.println("enter data to insert in node");
                    int data=in.nextInt();
                    
                    if(head==null){
                    head=op.new Node(data);
                    System.out.println("success!");
                    }

                    else
                    op.insert(head,data);
            }
            else if(ch==2){
                System.out.println("enter number which you want to delete from linkedlist");
                int data=in.nextInt();
                if(head.next==null)
                {
                    head=null;
                }
                else if(head==null)
                {
                    System.out.println("empty linkedlist");
                }
                else
                op.delete(head,data);
            }
            else if(ch==3){
                if(head==null)
                {
                    System.out.println("empty linkedlist");
                }
                else
                op.display(head);
            }
        }
        System.out.println("bye");
    }
}