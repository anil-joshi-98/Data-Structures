import java.util.*;
class TreeFun{
    Node Root=null;
    static class Node{
        Node left,right;
        int data;
        String data1;
        Node(int data,String data1){
            this.data1=data1;
            this.data=data;
            left=right=null;
        }
    }
    void insert(int data,String data1,Node node){
        if(data<node.data){
            if(node.left!=null){
                insert(data,data1,node.left);
            }
            else
                node.left=new Node(data,data1);
        }
        else if(data>node.data){
            if(node.right!=null)
                insert(data,data1,node.right);
            else
                node.right=new Node(data,data1);
        }  
    }
    void display(Node node) {
        if(node !=null){
            display(node.left);
            System.out.print(" roll no. ->>"+node.data+" name >>>"+node.data1);
            display(node.right);
        }
    }
}
class Tree extends TreeFun{
    public static void main(String[] args){
        TreeFun ob=new TreeFun();
        Node root=new Node(2,"hello");
        ob.insert(12,"anil",root);
        ob.insert(13,"joshi",root);
        ob.insert(14,"hello",root);
        ob.insert(1,"hey",root);
        ob.display(root);
    }
}