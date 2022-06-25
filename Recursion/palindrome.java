import java.util.Scanner;


public class palindrome {

    public static boolean isPalindrome(String s)
    {
        return isPalindrome(s, 0, s.length()-1);
    }

    public static boolean isPalindrome(String s, int startIndex, int endIndex)
    {
        if(startIndex==endIndex)
        {
            return true;
        }
      

        else if(s.charAt(startIndex)==s.charAt(endIndex))
        {
            return isPalindrome(s.substring(startIndex+1, endIndex));
        }
       

        else 
        {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
      
        System.out.println(isPalindrome(s));
    }

}
