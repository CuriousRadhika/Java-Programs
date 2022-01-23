import java.util.Scanner;

class PushZeroesToEnd{

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
    
    public static void pushzeroesToEnd(int a[])
    {
        for(int x=0 ; x<a.length ; x++)
        {
            for(int y=0 ; y<a.length-1 ; y++)
            {
                if(a[y] == 0 && a[y+1] != 0) 
                {
                    int t = a[y+1];
                    a[y+1] = a[y];
                    a[y]=t;
                }
            }
        }
    }
    public static void pushzeroesToEnd2(int a[])
    {
        int count = 0;
        for(int x=0 ; x<a.length ; x++)
        {
            if(a[x]!=0)
            a[count++] = a[x];
        }

        for(int x=count ; x<a.length ; x++) 
        {
            a[x] = 0;
        }

        // Or replace 2nd for loop with while loop
        // while(count < a.length)
        // {
        //     a[count++] = 0;
        // }
        
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1 ; x<=t ; x++)
        {
            int a[] = input();
            pushzeroesToEnd2(a);
            print(a);
          
            
        }
    }
}
