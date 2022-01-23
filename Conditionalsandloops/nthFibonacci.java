import java.util.Scanner;

class nthFibonacci{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=1, b=1, c=0, count = 0;

        if(n==1)
        System.out.println(a);
        else if(n==2)
        System.out.println(b);
        else {
        while(count < n-2)
        {
            c=a+b;
            a=b;
            b=c;
            count++;
        }
        System.out.println(c);
    }
    }
}
