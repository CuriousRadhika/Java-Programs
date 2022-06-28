import java.util.Scanner;
public class PairStar {

    public static String toPairStar(String s) {
        if(s.length()==1)
        return s;

        char ch1 = s.charAt(0);
        char ch2 = s.charAt(1);

        if(ch1==ch2) {
            return ch1+"*"+ toPairStar(s.substring(1));
        }
        else
        return ch1+ toPairStar(s.substring(1));


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(toPairStar(s));
    }
}
