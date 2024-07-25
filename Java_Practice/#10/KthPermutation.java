import java.util.Scanner;

public class KthPermutation 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<k;i++)
            kthPermutation(a, n);
        for(int i:a)
            System.out.print(i+" ");
        System.out.print("\n");
        sc.close();
    }
    public static void kthPermutation(int a[],int n)
    {
        int i=n-2;
        while(i>=0 && a[i]>=a[i+1])i--;
        if(i==-1)
        {
            rev(a,0,n);
            return;
        }
        int j=n-1;
        while(j>i && a[j]<=a[i])j--;
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
        rev(a,i+1,n);
    }
    public static void rev(int a[],int i,int n)
    {
        int x=0;
        for(int j=i;j<(i+n)/2;j++,x++)
        {
            int t=a[j];
            a[j]=a[n-1-(x)];
            a[n-1-(x)]=t;
        }
    }
}
// 3 4 5 2 1 3 8 7 1 0
// 3 4 5 2 1 3 8 7 1 0
// 3 4 5 2 1 7 0 1 3 8