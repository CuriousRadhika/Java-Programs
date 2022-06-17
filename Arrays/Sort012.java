import java.util.Scanner;
public class Sort012 {
    
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
    
    public static int[] sort(int a[])
    {

        int l=0, m=0, h=a.length-1;
        while(m<=h){
            if(a[m]==0)
            {
                int temp=a[l];
                a[l]=a[m];
                a[m]=temp;

                l++;
                m++;
            }
            else if(a[m]==1)
            m++;
            else
            {
                int temp=a[h];
                a[h]=a[m];
                a[m]=temp;
                h--;
            }
        }
        return a;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1 ; x<=t ; x++)
        {
            int a[] = input();
          sort(a);
           print(a);
          
            
        }
    }
}
