import java.util.*;
public class AllPermutation2 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
            a.add(sc.nextInt());
        allPermutation2(0,a);
        sc.close();
    }
    public static void allPermutation2(int i,ArrayList<Integer> a)
    {
        if(i>=a.size()-1)
        {
            System.out.println(a);
            return;
        }
        for(int j=i;j<a.size();j++)
        {
            int t=a.get(i);
            a.set(i,a.get(j));
            a.set(j,t);
            allPermutation2(i+1, a);
            t=a.get(i);
            a.set(i,a.get(j));
            a.set(j,t);
        }
    
    }
}
