import java.util.Arrays;
import java.util.Scanner;

public class fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        fib(n,dp);
        for(int i:dp)System.out.print(i+" ");
        sc.close();
    }
    public static int fib(int n,int dp[])
    {
        if(dp[n]!=-1)return dp[n];
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }
}