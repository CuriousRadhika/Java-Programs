import java.util.*;

public class SecondLargest {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int x = 0; x < a.length; x++) {
            a[x] = sc.nextInt();
        }
        return a;
    }

    public static void print(int[] a) {
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x] + " ");
        }

    }

    public static void printSecondLargest(int a[]) {
        int n = a.length;
        if (n < 2) {
            System.out.println(" Invalid Input ");
            return;
        }
        Arrays.sort(a);
        boolean print = false;
        for (int x =n-1 ; x>0 ; x--){
            if (a[x] != a[x-1])
            {
            System.out.println(a[x-1]);
            print=true;
            return;
            }
        }
        if(!print)
        {
            System.out.print(Integer.MIN_VALUE);
        }
    }

    public static void printSecondLargest2(int a[]) {
        int n = a.length;
        int first=a[0], second=Integer.MIN_VALUE;
        for(int x=1;x< a.length; x++)
        {
            if(a[x]>first){
                second=first;
                first=a[x];
            }
            else if(a[x]<first && a[x]>second)
            {
                second=a[x];
            }
        }
        System.out.println(second);
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 1; x <= t; x++) {
            int a[] = input();
            printSecondLargest(a);
        }
    }

//     // Java program to find second largest
// // element in an array
// class GFG{

//     // Function to print the second largest elements
//     static void print2largest3(int arr[], int arr_size)
//     {
//         int i, first, second;
    
//         // There should be atleast two elements
//         if (arr_size < 2)
//         {
//             System.out.printf(" Invalid Input ");
//             return;
//         }
    
//         int largest = second = Integer.MIN_VALUE;
    
//         // Find the largest element
//         for(i = 0; i < arr_size; i++)
//         {
//             largest = Math.max(largest, arr[i]);
//         }
    
//         // Find the second largest element
//         for(i = 0; i < arr_size; i++)
//         {
//             if (arr[i] != largest)
//                 second = Math.max(second, arr[i]);
//         }
//         if (second == Integer.MIN_VALUE)
//             System.out.printf("There is no second " +
//                             "largest element\n");
//         else
//             System.out.printf("The second largest " +
//                             "element is %d\n", second);
//     }
    
//     // Driver code
//     public static void main(String[] args)
//     {
//         int arr[] = { 12, 35, 1, 10, 34, 1 };
//         int n = arr.length;
        
//         print2largest(arr, n);
//     }
//     }
    
//     // This code is contributed by Amit Katiyar
    

}
