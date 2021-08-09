import java.util.Arrays;

class ModifiedBubbleSort{
    static int min(int arr[],int loc,int j){
        for(int i=j;i<arr.length;i++){
            if(arr[loc]>arr[i])
            loc=i;
        }
        return loc;
    }
    public static void main(String[] args){
        int arr[]={22,2,3,4,5,1};
        int s=0;
        for(int i=0;i<arr.length-1;i++){
            int loc=i;
            for(int j=i;j<arr.length;j++){
                s=min(arr,loc,j);
            }
            int temp=arr[loc];
            arr[loc]=arr[s];
            arr[s]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}