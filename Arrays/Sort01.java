import java.util.Scanner;

class Sort01{

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
    static void segregate0and1a(int arr[], int n)
    {
        int count = 0; // counts the no of zeros in arr
     
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }
 
        // loop fills the arr with 0 until count
        for (int i = 0; i < count; i++)
            arr[i] = 0;
 
        // loop fills remaining arr space with 1
        for (int i = count; i < n; i++)
            arr[i] = 1;
    }
    static void segregate0and1b(int arr[], int size)
    {
        /* Initialize left and right indexes */
        int left = 0, right = size - 1;
 
        while (left < right)
        {
            /* Increment left index while we see 0 at left */
            while (arr[left] == 0 && left < right)
               left++;
 
            /* Decrement right index while we see 1 at right */
            while (arr[right] == 1 && left < right)
                right--;
 
            /* If left is smaller than right then there is a 1 at left
               and a 0 at right.  Exchange arr[left] and arr[right]*/
            if (left < right)
            {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
    static void segregate0and1(int arr[]) {
        int type0 = 0;
        int type1 = arr.length - 1;
         
        while (type0 < type1) {
            if (arr[type0] == 1) {
                // swap
                arr[type1] = arr[type1]+ arr[type0];
                arr[type0] = arr[type1]-arr[type0];
                arr[type1] = arr[type1]-arr[type0];
                type1--;
            } else {
                type0++;
            }
        }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1 ; x<=t ; x++)
        {
            int a[] = input();
           
          segregate0and1b(a,a.length);
            
        }
    }
}
