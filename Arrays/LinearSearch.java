import java.util.Scanner;

class LinearSearch{

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
    public static int search(int[] a, int n)
    {
        for(int x=0 ; x<a.length ; x++)
        {
            if(a[x] == n)
            return x;
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1 ; x<=t ; x++)
        {
            int a[] = inputArray();
            int n = sc.nextInt();
            System.out.println(search(a, n));
           
        }
    }
}
