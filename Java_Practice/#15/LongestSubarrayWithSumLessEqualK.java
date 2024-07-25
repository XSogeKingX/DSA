import java.util.Scanner;

public class LongestSubarrayWithSumLessEqualK 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(solve(a,n,k));
        sc.close();
    }
    public static int solve(int a[],int n,int k)
    {
        int s=0,l=0,m=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            s=s+a[i];
            while(s>k)
            {
                s=s-a[l];
                l++;
            }
            m=Math.max(m,s);
        }
        return m;
    }
}