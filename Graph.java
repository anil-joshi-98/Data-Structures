import java.util.*;
class Operation{
    class Gnode{
        int v,e;
        int a[][];
        public Gnode(int v,int e){
            a=new int[v][v];
            this.v=v;
            this.e=e;
        }
    }

    Gnode creation(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter vertices and edges");
        int v=in.nextInt();
        int e=in.nextInt();
        Gnode gn=new Gnode(v,e);
        for(int i=0;i<v;i++)
            for(int j=0;j<v;j++){
                gn.a[i][j]=0;
            }
        for(int i=0;i<e;i++){
            int s=in.nextInt();
            int t=in.nextInt();
            gn.a[s][t]=1;
            gn.a[t][s]=1;
        }
        return gn;
    }
    void printGraph(Gnode gn){
        for(int i=0;i<gn.v;i++){
            for(int j=0;j<gn.v;j++){
                System.out.print(gn.a[i][j]+"  ");
            }System.out.println();
        }
    }
}
public class Graph {
    public static void main(String [] args){
        System.out.println("welcome to grpah");
        Operation op=new Operation();
        Operation.Gnode gn=op.creation();
        op.printGraph(gn);
    }
}
