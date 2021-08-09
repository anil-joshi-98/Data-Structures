import java.util.*;
class MaxCost{
    int maxCost(int arr[],int n){
        if(n==0){
            return 0;
        }int q=0;
        for(int i=0;i<n;i++){
            q=Math.max(q,arr[i]+maxCost(arr,n-1));
        }
        return q;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]={0,1,5,8,9,10,7,17,20,24,30};
        System.out.println(new MaxCost().maxCost(arr,4));
    }
}