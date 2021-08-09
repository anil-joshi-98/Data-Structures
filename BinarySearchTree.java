import java.util.*;
class Tree{
    Node root=null;
    static class Node{
        int data;
        Node lc,rc;
        Node(int data){
            lc=rc=null;
            this.data=data;
        }
    }
    void insertFun(Node node,int data){
        if(data<node.data){
            if(node.lc==null){
                node.lc=new Node(data);
            }
            else{
                insertFun(node.lc,data);
            }
        }
        else if(data>node.data){
            if(node.rc==null){
                node.rc=new Node(data);
            }
            else{
                insertFun(node.rc,data);
            }
        }
        else{
            if(node.lc==null){
                node.lc=new Node(data);
            }else{
            insertFun(node.lc,data);
            }
        }
    }
    void insert(int data){
        if(root==null){
            root=new Node(data);
        }
        else
        insertFun(root,data);
    }
    void displayFun(Node node){
        if(node!=null){
            displayFun(node.lc);
            System.out.print("  >>  "+node.data+"  ");
            displayFun(node.rc);
        }
    }
    void display(){
        if(root==null)
        System.out.println("nothing to print cz tree is empty");
        else
        displayFun(root);
    }
}
class BinarySearchTree{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Tree ob=new Tree();
        int ch=0;
        while(ch!=3){
            System.out.println("enter choice 1.insertion 2.display 3.exit");
            ch=in.nextInt();
            if(ch==1){
                System.out.println("enter data");
                int data=in.nextInt();
                ob.insert(data);
            }
            else if(ch==2){
                ob.display();
            }
            else if(ch==3){
                System.out.println("Thanks for using tree");
            }
            else 
            System.out.println("enter correct choice");
        }
    }
}