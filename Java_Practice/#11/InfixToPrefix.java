import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Infix : ");
        String infix=sc.nextLine();
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        HashMap<Character,Integer> prd=new HashMap<>();
        prd.put('^',3);
        prd.put('*',2);
        prd.put('/',2);
        prd.put('+',1);
        prd.put('-',1);
        System.out.println("Prefix : "+infixToPostfix(val, op, prd, infix));
        sc.close();
    }
    public static String infixToPostfix(Stack<String> val,Stack<Character> op,HashMap<Character,Integer> prd,String infix)
    {
        for(char ch: infix.toCharArray())
        {
            if(Character.isDigit(ch))val.push(""+ch);
            else if(op.isEmpty() || op.peek()=='(' || ch=='(')op.push(ch);
            else if(ch==')')
            {
                char c=op.pop();
                while(c!='(')
                {
                    String v2=val.pop();
                    String v1=val.pop();
                    val.push(c+v1+v2);
                    c=op.pop();
                }
            }
            else
            {
                if(prd.get(ch)<=prd.get(op.peek()))
                {
                    char c=op.pop();
                    String v2=val.pop();
                    String v1=val.pop();
                    val.push(c+v1+v2);
                    op.push(ch);
                }
                else op.push(ch);
            }
        }
        while(!op.isEmpty())
        {
            char c=op.pop();
            String v2=val.pop();
            String v1=val.pop();
            val.push(c+v1+v2);
        }
        
        return val.pop();
    }
}
