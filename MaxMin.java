import java.util.*;
class MaxMin{
    static ArrayList<Integer> max(int a[],int k){
        ArrayList<Integer> ob=new ArrayList<Integer>();
        for(int move=1;move<a.length;move++)
            for(int j=0;j<a.length-move;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            ob.add(a[k-1]);
            ob.add(a[a.length-k]);
    return ob;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a[]={2,3,4,5,62,3,4,22};
        int k=in.nextInt();
        ArrayList<Integer> ob=max(a,k);
        for(int i=0;i<ob.size();i++)
        System.out.println(ob.get(i));
    }
}