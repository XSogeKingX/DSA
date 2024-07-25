import java.util.*;
public class UniquePaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 && j==0)dp[i][j]=1;
                else{
                    int l=0,r=0;
                    if(j-1>=0)l=dp[i][j-1];
                    if(i-1>=0)r=dp[i-1][j];
                    dp[i][j]=l+r;
                }
            }
        }
        System.out.println(dp[n-1][m-1]);
        sc.close();
    }
    // public static int paths(int i,int j,int dp[][])
    // {
    //     if(i==0 && j==0) return 1;
    //     if(i<0 || j<0) return 0;
    //     if(dp[i][j]!=0)return dp[i][j];
    //     int l=paths(i, j-1,dp);
    //     int u=paths(i-1, j,dp);
    //     return dp[i][j]=l+u;
    // }
}
