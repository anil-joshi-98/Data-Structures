import java.util.ArrayList;
import java.util.Arrays;
class UnionIntersection{
    public static void main(String[] args){
        int a1[]={1,2,3,4,6};
        int a2[]={5,56,54,4,3,4};
        int n=a1.length+a2.length;
        int arr[]=new int[n];
        for(int i=0;i<a1.length;i++)
        arr[i]=a1[i];
        int j=0;
        for(int i=a1.length;i<arr.length;i++){
        arr[i]=a2[j];
        j++;
        }
        ArrayList<Integer> ob=new ArrayList<Integer>();
        ob.add(arr[0]);
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int k=0;k<ob.size();k++){
                if(arr[i]==ob.get(k))
                flag=false;
            }
            if(flag==true)
               ob.add(arr[i]);
        }
        System.out.println("union="+Arrays.toString(arr));
        for(int i=0;i<ob.size();i++) {
            System.out.print(ob.get(i)+" ");
        }
    }
}