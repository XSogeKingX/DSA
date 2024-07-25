import java.util.*;

public class HistogramArea 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++)
            ans=Math.max(ans,maxArea(i,arr,1,Integer.MAX_VALUE));
        System.out.println(ans);
        sc.close();
    }
    public static int maxArea(int i,int arr[],int c,int m)
    {
        if(i==arr.length)
            return 0;
        m=Math.min(arr[i],m);
        return Math.max(maxArea(i+1, arr, c+1, m),m*c);
    }
}
