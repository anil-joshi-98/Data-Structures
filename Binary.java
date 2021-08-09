import java.util.*;
class Binary{
    int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)return i;
        }
        return -1;
    }
    int binarySearch(int arr[],int key){
        int len=arr.length;
        int newLen=0;
        int start=0,end=len;
        while(newLen>=0){
            newLen=(start+end)/2;
            if(arr[newLen+1]==key)
            return newLen+1;
            else if(arr[newLen]==key)
            return newLen;
            else if(arr[newLen-1]==key)
            return newLen-1;
            else if(arr[newLen]>key)
                end=newLen;
            else
                start=newLen;
        }
        return -1;
    }
    void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>=0 && temp<arr[j];j--)
                arr[j+1]=arr[j];
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int arr[]=new int[x];
        Binary ob=new Binary();
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        ob.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("enter number you want to search in this array");
        int k=in.nextInt();
        if(ob.binarySearch(arr, k)==-1)
        System.out.println("Element not found");
        else
        System.out.println("Element found at Position="+(ob.binarySearch(arr,k)+1));
        /*if(ob.linearSearch(arr, k)==-1)
        System.out.println("Element not found");
        else
        System.out.println("Element found at Position="+(ob.linearSearch(arr,k)+1));
        */
    }
}