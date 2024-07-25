import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParentheses
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="(";
        List<String> a=new ArrayList<>();
        generateParentheses(n, 0, 1, s, a);
        System.out.println(a);
        sc.close();
    }
    public static void generateParentheses(int n,int c,int o,String s,List<String> a)
    {
        if(c==n)
        {
            a.add(s);
            return;
        }
        if(o+1<=n)
        {
            s=s+'(';
            generateParentheses(n, c, o+1, s, a);
            s=s.substring(0,s.length()-1);
        }
        if(c+1<=o)
        {
            s=s+')';
            generateParentheses(n, c+1, o, s, a);
            s=s.substring(0,s.length()-1);
        }
    }
}