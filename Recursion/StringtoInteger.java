import java.util.Scanner;

public class StringtoInteger {
    public static int toInteger(String s) {

        int l = s.length();
        char c = s.charAt(0);

        if (l == 1)
            return (int) c - 48; // ascii value of '0' is  48

        else {

            return (int) (((int)c - 48) * Math.pow(10, l-1) + toInteger(s.substring(1)));
        }
    }
    static int stringToInt(String str)
    {
 
        // If the number represented as a string
        // contains only a single digit
        // then returns its value
        if (str.length() == 1)
            return (str.charAt(0) - '0');
 
        // Recursive call for the sub-string
        // starting at the second character
        double y = stringToInt(str.substring(1));
 
        // First digit of the number
        double x = str.charAt(0) - '0';
 
        // First digit multiplied by the
        // appropriate power of 10 and then
        // add the recursive result
        // For example, xy = ((x * 10) + y)
        x = x * Math.pow(10, str.length() - 1) + y;
        return (int)(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(toInteger(s));
    }
}
