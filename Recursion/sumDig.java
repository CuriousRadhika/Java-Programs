import java.util.Scanner;
public class sumDig {
    public static int sumDig(int n)
    {
        if(n<10){
            return n;
        }
        return n%10+sumDig(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(sumDig(n));
    }
}
