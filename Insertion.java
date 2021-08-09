import java.util.*;
class Insertion{
    public static void main(String [] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=in.nextInt();
        int i,j,temp;
        for(i=1;i<n;i++) {
            temp=a[i];
            for(j=i-1;j>=0 && temp<a[j];j--)
                a[j+1]=a[j];    
            a[j+1]=temp;
        }System.out.println(Arrays.toString(a));
    }   
}