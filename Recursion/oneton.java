import java.util.Scanner;
public class oneton {
    public static void print(int n)
    {
        if (n > 1)
        print(n-1);
        System.out.print(n+"\t");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        int n=sc.nextInt();
       print(n);
    }
}
