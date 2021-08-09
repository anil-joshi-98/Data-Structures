import java.util.*;
import java.io.*;
class CountingSort{
    void countSort(int a[],int k,int n,int b[]){
        int c[]=new int[k+1];
        k++;
        Arrays.fill(c,0);
        for(int i=0;i<n;i++){
            c[a[i]]++;
        }
        for(int i=1;i<k;i++){
            c[i]+=c[i-1];
        }
        for(int i=n-1;i>=0;i--){
            b[c[a[i]]-1]=a[i];
            c[a[i]]--;
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter size of unsorted array");
        int n=input.nextInt();
        System.out.println("enter range of values inside array");
        int k=input.nextInt();
        System.out.println("enter values for array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=input.nextInt();
        int b[]=new int[n];
        new CountingSort().countSort(a,k,n,b);
        System.out.println(Arrays.toString(b));
    }
}