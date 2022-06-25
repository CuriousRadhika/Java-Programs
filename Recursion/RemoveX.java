import java.util.Scanner;
public class RemoveX {
    private static String removeX(String s, int startIndex,  String str)
    {
        if(s.length()==startIndex)
        return str;

        char ch = s.charAt(startIndex);
        if(ch != 'x')
        {
            str+=ch;
        }
        return removeX(s, startIndex+1 , str);
    }
    public static String removeX(String s)
    {
        String str="";
        return removeX(s, 0 , str );
    }
    public static String removeX1(String s)
    {
        if(s.length()==0)
        return str;
        String ans="";

        if(str.charAt(0)!='x')
        ans+=str.charAt(0);

        return ans+removeX(s.substring(1));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s=sc.next();
        System.out.println(removeX(s));
    }
}
