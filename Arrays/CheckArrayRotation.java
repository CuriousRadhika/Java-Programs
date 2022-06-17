import java.util.Scanner;
public class CheckArrayRotation {
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
    
    public static void checkArrayRotation(int a[])
    {

        int count = 0,x=0;
        while(a[x]<a[x+1]){
            count++;
            x++;
        }
        System.out.println(count+1);
    }
    
    // we can notice that the number of rotations is equal to index of minimum element. A simple sol is to find minimum element and returns its index through linear or binary search. 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1 ; x<=t ; x++)
        {
            int a[] = input();
          
           checkArrayRotation(a);
          
            
        }
    }
}
