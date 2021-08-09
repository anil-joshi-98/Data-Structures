import java.rmi.server.Operation;
import java.util.*;
class Operations{
    class Node{
        Node right,left;
        int data;
        Node(int data){
            right=left=null;
            this.data=data;
        }
    }
    void insert(int data,Node root){
        
        if(data>root.data){

            if(root.right==null){
                root.right=new Node(data);
            }
            else
            insert(data,root.right);
        }
        else if(data<root.data){
            if(root.left==null){
                root.left=new Node(data);
            }
            else
            insert(data,root.left);
        }
    }
    void display(Node root,ArrayList<Integer> obb){
        if(root!=null){
            display(root.left,obb);
            obb.add(root.data);
            display(root.right,obb);
        }
    }
    ArrayList<Integer> o=new ArrayList<Integer>();
    int count=0;
    void terminals(Node root){
        if(root!=null){
            terminals(root.left);
            if(root.left==null && root.right==null)
            {
                o.add(root.data);
                count++;
            }
            terminals(root.right);
        }
    }
    ArrayList<Integer> returnSomething()
    {
        o.add(count);
        return o;
    }
}
class TreeExample{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Operations ob=new Operations();
        Operations.Node root=ob.new Node(5);
        ob.insert(12,root);
        ob.insert(23,root);
        ob.insert(22,root);
        ob.insert(11,root);
        ArrayList<Integer> obb=new ArrayList<Integer>();
        ob.display(root,obb);
        for(int d:obb)
        System.out.print(">> "+d+" ");
        ob.terminals(root);
        ArrayList<Integer> s=new ArrayList<Integer>();
        s=ob.returnSomething();
        int i=0;
        for(int data:s){
            {
                System.out.print("  data>>"+data);
            }
        }
    }
}