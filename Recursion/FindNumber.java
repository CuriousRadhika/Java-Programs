import java.util.Scanner;
public class FindNumber {
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
    private static boolean checkNum(int a[], int x , int startIndex)
    {
        if(startIndex >= a.length)
        return false;

        else if(a[startIndex]==x)
        return true;

        else
        return checkNum(a,x, startIndex+1);
    }
    public static boolean checkNum(int a[], int x)
    {
        return checkNum(a, x, 0);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
            int a[] = input();
            int x = sc.nextInt();
            System.out.println(checkNum(a,x));
          
    } 
}
