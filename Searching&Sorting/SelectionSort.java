import java.util.Scanner;

class SelectionSort{

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
    public static void selectionsort(int[] a)
    {
        for(int x=0 ; x<a.length-1 ; x++)
        {
            int index=x;
            for(int y=x+1 ; y<a.length ; y++)
            {
                if(a[y]<a[index])
                index = y;
            }
            if(index!=x)
            {
                int t = a[x];
                a[x] = a[index];
                a[index] = t;
            }

        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1 ; x<=t ; x++)
        {
            int a[] = input();
            selectionsort(a);
           print(a);
          
            
        }
    }
}
