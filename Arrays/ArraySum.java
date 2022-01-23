import java.util.Scanner;

class ArraySum{

    public static int[] inputArray()
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
    public static int findSum(int[] a)
    {
        int sum=0;
        for(int x=0 ; x<a.length ; x++)
        {
            sum+=a[x];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0 ; x<t ; x++)
        {
            int a[] = inputArray();
            System.out.println(findSum(a));
        }
    }
}
