import java.util.Scanner;

class nthFibonacci2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=1, b=1, c=0, count=2;
        if(n==1)
        System.out.println(a);
        else if(n==2)
        System.out.println(b);
        else
        {
        while(true){
            c=a+b;
            count++;

            if(count==n)
            break;

            a=b;
            b=c;
        }
        System.out.println(c);
    }

        
    }
}
