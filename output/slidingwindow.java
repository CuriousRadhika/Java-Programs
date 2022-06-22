import java.util.Scanner;

class slidingwindow{

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
   
    
    public static void countDistinct(int a[], int k)
    {
        int n = a.length-k;
        for(int x=0 ; x<n ; x++)
        {
            int count=0;
            for(int y=x ; y<(x+k) ; y++)
            {
                int e=a[y];
                for(int z=x ; z<(x+k) ; z++)
                {
                    if(e==a[z])
                    break;
                    else
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
            int a[] = input();

            int k = sc.nextInt();

          countDistinct(a, k);
            
        
    }
}