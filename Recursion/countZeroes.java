import java.util.Scanner;
public class countZeroes {
    public static int countZeroes(int n, int c)
    {
        if(n==0)
        return c;

        int d = n%10;
        if(d==0)
        c++;
        return countZeroes(n/10 , c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        System.out.println(countZeroes(n,c));
    }
}
