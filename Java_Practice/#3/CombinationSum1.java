import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        ArrayList<Integer> x=new ArrayList<>();
        combinationSum(a, 0, k, x);
        sc.close();
    }
    public static void combinationSum(int a[],int i,int k,ArrayList<Integer> x)
    {
        if(i>=a.length || k<=0)
        {
            if(k==0)System.out.println(x);
            return;
        }
        int j=a[i];
        x.add(j);
        combinationSum(a, i, k-j, x);
        x.remove(Integer.valueOf(j));
        combinationSum(a, i+1, k, x);
    }
}
