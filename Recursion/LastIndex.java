import java.util.Scanner;
public class LastIndex {
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
    private static int lastIndex(int a[], int x , int startIndex)
    {
        if(startIndex < 0)
        return -1;

        else if(a[startIndex]==x)
        return startIndex;

        else
        return lastIndex(a,x, startIndex-1);
    }
    public static int lastIndex(int a[], int x)
    {
        return lastIndex(a, x, a.length-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
            int a[] = input();
            int x = sc.nextInt();
            System.out.println(lastIndex(a,x));
          
    } 
}
