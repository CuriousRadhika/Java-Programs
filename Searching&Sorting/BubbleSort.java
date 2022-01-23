import java.util.Scanner;

class BubbleSort{

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
    public static void bubblesort(int[] a)
    {
        for(int x=0 ; x<a.length-1 ; x++){
            for(int y=0 ; y<a.length -1 -x ; y++){
                if(a[y]>a[y+1]){
                    int t = a[y];
                    a[y] = a[y+1];
                    a[y+1] = t;
                }
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
            bubblesort(a);
           print(a);
          
            
        }
    }
}
