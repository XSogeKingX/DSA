import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CombinationSum2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        ArrayList<Integer> b=new ArrayList<>();
        HashSet<ArrayList<Integer>> ans=new HashSet<>();

        combinationSum2(0,a,k,b,ans);
        System.out.println(ans);
        sc.close();
    }
    public static void combinationSum2(int i,int a[],int k,ArrayList<Integer> b,HashSet<ArrayList<Integer>> ans)
    {
        if(i>=a.length || k<=0)
        {
            if(k==0)
                ans.add(new ArrayList<>(b));
            return;
        }
        b.add(a[i]);
        combinationSum2(i+1, a, k-a[i], b, ans);
        b.remove(Integer.valueOf(a[i]));
        combinationSum2(i+1, a, k, b, ans);
    }
}
