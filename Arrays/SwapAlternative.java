import java.util.Scanner;

class SwapAlternative{

    public static int[] input()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int x=0 ; x<a.length ; x++)
        {
            a[x] = sc.nextInt();
        }
        return a;
    }
    public static void print(int[] a)
    {
        for(int x=0 ; x<a.length ; x++)
        {
            System.out.print(a[x]+" ");
        }
        
    }
    public static void swapAlternative(int a[])
    {
        for(int x=0 ; x<a.length-1 ; x+=2)
        {
            int t = a[x];
            a[x] = a[x+1];
            a[x+1]=t;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0 ; x<t ; x++)
        {
            int a[] = input();
            swapAlternative(a);
            print(a);
        }
    }
}
