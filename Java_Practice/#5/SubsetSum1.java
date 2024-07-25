import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsetSum1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>();
        subsetSum1(0,a,0,ans);
        Collections.sort(ans);
        System.out.println(ans);
        sc.close();
    }
    public static void subsetSum1(int i,int a[],int k, ArrayList<Integer> ans)
    {
        if(i>=a.length)
        {
            ans.add(k);
            return;
        }
        subsetSum1(i+1, a, k+a[i], ans);
        subsetSum1(i+1, a, k, ans);
    }
}
