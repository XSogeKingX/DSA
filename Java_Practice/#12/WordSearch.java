import java.util.Scanner;

public class WordSearch 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int m=sc.nextInt();
        int n=sc.nextInt();
        char board[][]=new char[m][n];
        int track[][]=new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            board[i][j]=sc.next().charAt(0);
        System.out.println(search1st(board, s, track));
        sc.close();
    }
    public static boolean search1st(char [][]board,String s,int [][]track)
    {
        char c=s.charAt(0);
        String str="";
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==c)
                {
                    track[i][j]=1;
                    str=""+c;
                    if(search(1,i,j,board,s,track,str))return true;
                    str="";
                }
            }
        }
        return false;
    }
    public static boolean search(int p,int i,int j,char [][]board,String s,int [][]track,String str)
    {
        if(p>=s.length()){
            return true;
        }
        if(down(s.charAt(p),track,i,j,board))
        {
            track[i+1][j]=1;
            str=str+s.charAt(p);
            if(search(p+1, i+1, j, board, s, track,str))return true;
            str=str.substring(0,str.length()-1);
            track[i+1][j]=0;
        }
        if(left(s.charAt(p),track,i,j,board))
        {
            track[i][j-1]=1;
            str=str+s.charAt(p);
            if(search(p+1, i, j-1, board, s, track,str))return true;
            str=str.substring(0,str.length()-1);
            track[i][j-1]=0;
        }
        if(right(s.charAt(p),track,i,j,board))
        {
            track[i][j+1]=1;
            str=str+s.charAt(p);
            if(search(p+1, i, j+1, board, s, track,str)) return true;
            str=str.substring(0,str.length()-1);
            track[i][j+1]=0;
        }
        if(up(s.charAt(p),track,i,j,board))
        {
            track[i-1][j]=1;
            str=str+s.charAt(p);
            if(search(p+1, i-1, j, board, s, track,str)) return true;
            str=str.substring(0,str.length()-1);
            track[i-1][j]=0;
        }
        // System.out.println(str);
        return false;
    }
    public static boolean down(char c,int [][]track,int i,int j,char [][]board)
    {
        if(i+1<board.length)
            if(track[i+1][j]==0 && board[i+1][j]==c)return true;
        return false;
    }
    public static boolean left(char c,int [][]track,int i,int j,char [][]board)
    {
        if(j-1>=0)
            if(track[i][j-1]==0 && board[i][j-1]==c)return true;
        return false;
    }
    public static boolean right(char c,int [][]track,int i,int j,char [][]board)
    {
        if(j+1<board[0].length)
            if(track[i][j+1]==0 && board[i][j+1]==c)return true;
        return false;
    }
    public static boolean up(char c,int [][]track,int i,int j,char [][]board)
    {
        if(i-1>=0)
            if(track[i-1][j]==0 && board[i-1][j]==c)return true;
        return false;
    }
    
}
