import java.util.Scanner;
public class SumOf2Arrays {
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
    
    public static void add(int[] a, int b[], int c[])
    {
        int i = a.length - 1;
        while(i >= 0)
        {
            int sum=a[i]+b[i];
            if(sum>9)
            {
                int d1=sum%10;
                int d2=sum/10;
                c[i+1]+=d1;
                c[i]+=d2;
            }
            else{
                c[i+1]+=sum;
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
            int b[] = input();
            int c[] = new int[((a.length>b.length) ? a.length : b.length)+1];

            add(a,b,c);

            print(c);
            
        }
    }
}
