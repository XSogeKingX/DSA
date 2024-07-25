import java.util.ArrayList;
import java.util.Scanner;

public class AllPermutation
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int x[]=new int[n];
        ArrayList<Integer> ans=new ArrayList<>();
        allPermutation(a,ans,x);
        sc.close();
    }
    public static void allPermutation(int a[],ArrayList<Integer> ans,int x[])
    {
        if(ans.size()==a.length)
        {
            System.out.println(ans);
            return;
        }
        for(int j=0;j<a.length;j++)
        {
            
            if(x[j]==0)
            {
                ans.add(a[j]);
                x[j]=1;
                allPermutation(a, ans, x);
                ans.remove(ans.size()-1);
                x[j]=0;
            }
        }
    }
}