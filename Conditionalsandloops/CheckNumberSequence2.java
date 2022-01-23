import java.util.Scanner;

class CheckNumberSequence1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = true;
        int arr[] = new int[n];
        for(int x = 0; x < n; x++)
        {
            arr[x] = sc.nextInt();
        }
        for(int x = 0; x < n-1; x++)
        {
            if(ar[x]>ar[x+1])
            b=true;
            
        }
        
    }
}
