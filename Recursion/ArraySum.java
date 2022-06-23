import java.util.Scanner;
public class ArraySum {
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

    private static int array_sum(int[] a , int startIndex , int sum)
    {
        if(startIndex >= a.length)
        return sum;
        else 
        return sum = sum+ a[startIndex] + array_sum(a, startIndex+1 , sum);
    }
    public static int array_sum(int a[])
    {
        int sum=0;
        return array_sum(a,0,sum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
      
        
            int a[] = input();
          
          
          System.out.println(array_sum(a));
            
        
    }
}
