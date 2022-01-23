import java.util.Scanner;

class nthFibonacci3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=1, b=1;

        if(n==1)
        System.out.println(a);
        else if(n==2)
        System.out.println(b);
        else {
            int c=0;
        for(int x=3 ; x<=n ; x++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
    }
}
