import java.util.Scanner;

public class NoConsecutive1s 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		noConsecutive1s(0,a);
        sc.close();
	}
	public static void noConsecutive1s(int i, int a[])
	{
	    for(int j:a)
	        System.out.print(j+" ");
	    System.out.println();
	    if(i>=a.length)return;
	    for(int j=i;j<a.length;j++)
	    {
	        if(j>0 && a[j-1]==1)continue;
	        a[j]=1;
	        noConsecutive1s(j+1,a);
	        a[j]=0;
	    }
    }
}
