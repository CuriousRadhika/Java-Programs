import java.util.Scanner;

class PairSum{

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
    
  public static int pairsum(int[] a, int n)
  {
      int c=0;
      for(int x=0 ; x<a.length ; x++)
      {
          for(int y=x+1 ; y<a.length ; y++)
          {
              if(a[x]+a[y]==n && x!=y)
              {
                 
              c++;
              }
          }
      }
      return c;
  }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1 ; x<=t ; x++)
        {
            int a[] = input();
            int n=sc.nextInt();
            System.out.println(pairsum(a,n));
          
            
        }
    }
}

