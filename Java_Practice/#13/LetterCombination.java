import java.util.HashMap;
import java.util.Scanner;

public class LetterCombination 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        letterCombination(0, s, map, "");
        sc.close();
    }
    public static void letterCombination(int i,String s,HashMap<Character,String> map,String t)
    {
        if(i>=s.length())
        {
            System.out.println(t);
            return;
        }
        for(int j=0;j<map.get(s.charAt(i)).length();j++)
        {
            t=t+map.get(s.charAt(i)).charAt(j);
            letterCombination(i+1, s, map, t);
            t=t.substring(0,t.length()-1);
        }
    }
}
