import java.util.Scanner;

class isFibonacci{

    public static boolean isFib(int n)
    {
        int a=0,b=1,c=0;

        while(true){

            c=a+b;

            if(n==c)
            return true;
            else if(c>n)
            return false;
            

            a=b;
            b=c;
        }
        

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isFib(n));
    }
}
