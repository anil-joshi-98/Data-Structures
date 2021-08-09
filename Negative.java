import java.util.*;
class Negative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x[]={1,2,3,-1,-3,-1,4};
        for(int i=1;i<x.length;i++){
            for(int j=0;j<x.length-i;j++){
                if(x[j]>x[j+1]){
                    int temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(x));
        sc.close();
    }
}