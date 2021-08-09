import java.util.*;
class Insearchion{
    static boolean isSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
            return false;
        }
        return true;
    }
    public int minSwaps(int arr[])
    {   
        int count=0;
        if(isSort(arr))
        return count;
        
        
        for(int i=0;i<arr.length;i++){
            boolean st=false;
            int t=i;
            for(int j=i+1;j<arr.length-1;j++){
                
                if(arr[i]<arr[j]){
                    st=true;
                    if(arr[j]<arr[t])
                        t=j;
                }
            }
                if(st){
                    int d=arr[t];
                    arr[t]=arr[i];
                    arr[i]=d;
                    count++;
                }
            
        }
        
        return count;
    }
    public static void main(String[] args){
        int arr[]={10, 19, 6, 3, 5};
        System.out.println(new Insearchion().minSwaps(arr));
    }
}