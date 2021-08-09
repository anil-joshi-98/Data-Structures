import java.util.*;
class Doubly{
    Node head=null;
    class Node{
        Node next,prev;
        int data;
        public Node(int data){
            this.data=data;
            next=prev=null;
        }
    }
    
    void insert(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            return;
        }
        temp.next=head;
        head.prev=temp;
        head=temp;
    }
    void display(){
        if(head==null){
            System.out.println("empty doubly linkedlist");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    Node delete(Node temp,int data){
        if(temp.next.data==data)
        return temp;
        return delete(temp.next,data);
    }
    void delete(int data){
        if(head==null){
            System.out.println("empty DLL");
            return;
        }
        if(head.data==data){
            if(head.next==null)
                head=null;
            else{
                head.data=head.next.data;
                head.next=head.next.next;
            }
            return;
        }
        Node temp=delete(head,data);
        if(temp.next.next==null){
            temp.next=null;
        }else
        temp.next=temp.next.next;
    }
    void reverse(){
        if(head==null){
            System.out.println("empty DLL");
            return;
        }
        Node temp=head,t=head;
        while(t.next!=null){
            t=t.next; 
        }
        while(t.next!=temp || temp.prev!=t){
            int te=temp.data;
            temp.data=t.data;
            t.data=te;
            t=t.prev;
            temp=temp.next;
            if(t==temp)
            break;
        }
    }
    void rotate(int k){
        Stack<Integer> st=new Stack<>();
        Node temp=head;
        Node t=temp;
        while(temp!=null){
            int m=k;
            while(m-->0 && temp!=null){
                st.push(temp.data);
                temp=temp.next;
            }
            while(t!=temp){
                t.data=st.pop();
                t=t.next; 
                if(t.next==null){
                    t.data=st.pop();
                    break;
                }
            }
            
        }
    }
    void groupRev(int n){
        Node t1,t2,t3,t4;
        boolean f=true;
        t1=t2=t3=t4=head;
        int k=n-1;
        while(k-->0){
            t2=t2.next;
        }
        while(t2.next!=null){
            k=n-1;
            t3=t4=t2.next;
            if(t3.next==null){
                t3=t4;
            }
            else{
            while(k-->0){
                t4=t4.next;
                if(t4.next==null)
                break;
            }
            }
            if(f){
                t3.prev=null;
                head=t3;
                f=false;
            }
            else{
                Node x=t1.prev;
                t3.prev=x;
                x.next=t3;
            }
            Node t5=t4.next;
            t4.next=t1;
            t1.prev=t4;
            t2.next=t5;
            if(t5!=null)
            t5.prev=t2;
            if(t2.next==null)
            break;
        }
    }
    void vanish(){
        head=null;
    }
    void getNodes(int x){
        Node temp=head,temp1=head;
        int count=0;
        while(temp1.next!=null)
        temp1=temp1.next;
        while(temp1!=temp){
            int data=temp1.data+temp.data;
            if(data==x){
                System.out.println(temp.data+"+"+temp1.data+"="+x);
                temp1=temp1.prev;
                temp=temp.next;
                count++;
            }
            else if(data>x){
                temp1=temp1.prev;
            }
            else if(data<x){
                temp=temp.next;
            }
            if(temp1==temp)
            {
                break;
            }
        }
        if(count==0){
            System.out.println("no node found similar to your data");
        }
    }
    void sort(int k){
        Node temp=head;
        while(temp.next!=null){
            int m=k;
            Node t=temp.next;
            while(m-->0){
                if(t.data<temp.data){
                    int te=t.data;
                    t.data=temp.data;
                    temp.data=te;
                }
                if(t.next==null){
                    if(t.data<temp.data){
                    int te=t.data;
                    t.data=temp.data;
                    temp.data=te;
                }
                break;
                }
                t=t.next;
            }
            temp=temp.next;
        }
    }
    void tripleSum(int x){
        Node temp=head,temp1=head,temp2=head.next,temp3=head;
        int count=0;
        while(temp1.next!=null)
        temp1=temp1.next;
        while(temp.next.next!=temp1){
            temp3=temp1;
            temp2=temp.next;
            while(temp3!=temp2.next){
            int data=temp3.data+temp2.data+temp.data;
            if(data==x){
                System.out.println(temp.data+"+"+temp2.data+"+"+temp3.data+"="+x);
                temp3=temp3.prev;
                temp2=temp2.next;
                count++;
            }
            else if(data>x){
                temp3=temp3.prev;
            }
            else if(data<x){
                temp2=temp2.next;
            }
            if(temp3==temp2)
            {
                break;
            }
            }
            temp=temp.next;
            if(temp.next.next==temp1)
            break;
        }
        if(count==0)
        System.out.println("no sum is equal to x");
    }
}
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Doubly ob=new Doubly();
        while(true){
            System.out.printf("1.Insert\n2.Display\n3.Delete\n4.Reverse\n5.Rotate\n6.Reverse group of nodes\n7.Vanish DLL\n8.Get 2 nodes whose data is equal to your entered data\n9.Sort k sorted DLL\n10.Sum of three element is equal or not to the entered number\n11.Exit\n");
            int ch=sc.nextInt();
            if(ch==1){
            System.out.println("enter the data to insert in DLL");
            ob.insert(sc.nextInt());
            }
            else if(ch==2)
            ob.display();
            else if(ch==3){
                System.out.println("enter data to delete from the DLL");
                ob.delete(sc.nextInt());
            }
            else if(ch==4){
                ob.reverse();
            }
            else if(ch==5){
                ob.rotate(3);
            }
            else if(ch==6){
                int n=2;
                ob.groupRev(2);
            }
            else if(ch==7){
                ob.vanish();
            }
            else if(ch==8){
                System.out.println("Enter data to find two nodes equal to that data");
                ob.getNodes(sc.nextInt());
            }
            else if(ch==9){
                System.out.println("Enter how far sorted element from their actual position");
                ob.sort(sc.nextInt());
            }
            else if(ch==10){
                System.out.println("Enter what would be the sum of there DLL's element");
                ob.tripleSum(sc.nextInt());
            }
            else if(ch==11){
                System.out.println("Thanks for using DLL");
                break;
            }
        }
    }
}