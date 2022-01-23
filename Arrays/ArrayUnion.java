import java.util.Scanner;

class ArrayUnion{

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
    
    // https://www.geeksforgeeks.org/find-union-and-intersection-of-two-unsorted-arrays/
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1 ; x<=t ; x++)
        {
            int a[] = input();
            int b[] = input();
            int c[] = combine(a,b);
            print(c);
          
            
        }
    }
}


