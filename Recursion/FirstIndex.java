import java.util.Scanner;
public class FirstIndex {
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
    private static int firstIndex(int a[], int x , int startIndex)
    {
        if(startIndex >= a.length)
        return -1;

        else if(a[startIndex]==x)
        return startIndex;

        else
        return firstIndex(a,x, startIndex+1);
    }
    public static int firstIndex(int a[], int x)
    {
        return firstIndex(a, x, 0);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
            int a[] = input();
            int x = sc.nextInt();
            System.out.println(firstIndex(a,x));
          
    } 
}
