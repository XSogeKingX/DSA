import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubsetSum2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(a);
        subsetSum2(0, a, ans);
        sc.close();
    }
    public static void subsetSum2(int i,int a[],ArrayList<Integer> ans)
    {
        System.out.println(ans);
        for(int j=i;j<a.length;j++)
        {
            if(j!=i && a[j]==a[j-1])continue;
            ans.add(a[j]);
            subsetSum2(j+1, a, ans);
            ans.remove(ans.size()-1);
        }
    }
}
