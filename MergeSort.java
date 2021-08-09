import java.util.*;
class MergeSort{
    static void mergeProcedure(int a[],int l,int m,int h){
        int n1=m-l+1;
        int n2=h-m;
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        int i,j;
        i=j=0;
        for(;i<n1;i++){
            a1[i]=a[l+i];
        }
        for(;j<n2;j++){
            a2[j]=a[m+1+j];
        }
        i=j=0;
        int k=l;
        while(j<n2 && i<n1){
            if(a1[i]<=a2[j]){
            a[k]=a1[i];
            i++;
            }
            else{
            a[k]=a2[j];
            j++;
            }
            k++;
        }
        while(j<n2){
            a[k]=a2[j];
            j++;
            k++;
        }
        while(i<n1){
            a[k]=a1[i];
            i++;
            k++;
        }
    }
    static void sort(int a[],int l,int h){
        if(l<h){
            int m=(l+h)/2;
            sort(a,l,m);
            sort(a,m+1,h);
            mergeProcedure(a,l,m,h);
        }
    }
    public static void main(String[] args){
        int a[]={88,66,55,77,44,33,22,11};
        sort(a,0,7);
        System.out.println(Arrays.toString(a));
    }
}