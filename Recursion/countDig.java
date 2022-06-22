import java.util.*;

class countDig
{
    public static int countDig(int n)
    {
        if(n<10){
            return 1;
        }
        return 1+ countDig(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(countDig(n));
    }
}