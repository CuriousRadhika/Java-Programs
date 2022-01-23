import java.util.Scanner;

class FindDuplicate{

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
    
    public static int findDuplicate(int[] a)
    {
        int arrsum=0;
        int s=0;
        for(int x=0 ; x<a.length ; x++)
        {
            arrsum+=a[x];
        }
        // for(int x=1 ; x<=a.length-2 ; x++)
        // {
        //     s+=x;
        // }
        int n=a.length;
        s=((n-2)*(n-1))/2;
        return arrsum-s;
    }
    int printRepeating(int arr[], int size)
    {
        int count[] = new int[size];
        int i;
 
        System.out.println("Repeated elements are : ");
        for (i = 0; i < size; i++)
        {
            if (count[arr[i]] == 1)
                return arr[i];
            else
                count[arr[i]]++;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0 ; x<t ; x++)
        {
            int a[] = input();
            System.out.println(findDuplicate(a));
            
        }
    }
}
