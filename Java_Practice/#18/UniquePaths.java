import java.util.*;
public class UniquePaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int dp[][]=new int[n][m];
        dp[0][0]=1;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)    
                a[i][j]=sc.nextInt();
        System.out.println(paths(n-1, m-1, a, dp));
        sc.close();
    }
    public static int paths(int i,int j,int a[][], int dp[][])
    {
        if(i==0 && j==0)return 1;
        if(i<0 || j<0 || a[i][j]==-1)return 0;
        if(dp[i][j]!=0)return dp[i][j];
        int l=paths(i, j-1, a, dp);
        int u=paths(i-1, j, a, dp);
        return dp[i][j]=l+u;
    }
}
