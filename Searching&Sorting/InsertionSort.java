
import java.util.Scanner;

class InsertionSort{

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
    public static void insertionsort(int[] a)
    {
        for(int x=1 ; x<a.length ; x++)
        {
            int e=a[x]; int index=0;
            for(int y=x-1 ; y>=0 ; y--){
                if(e<a[y])
                {
                    a[y+1]=a[y];
                }
                index=y;
               
            }
            a[index] = e;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1 ; x<=t ; x++)
        {
            int a[] = input();
            insertionsort(a);
           print(a);
          
            
        }
    }
}
