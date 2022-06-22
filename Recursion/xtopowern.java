import java.util.*;

class xtopowern
{
    public static double power1(int x, int n)
    {
        if(n>0)
        return power(x,n-1)*x;
        else if(n==0)
        return 0;
        else 
        return 1.0/power(x,-n);
    }
    public static int power(int x, int n)
    {
        if(n==0)
        return 1;
        else
        return power(x,n-1)*x;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power1(x,n));
    }
}