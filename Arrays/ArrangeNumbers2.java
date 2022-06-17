import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

class ArrangeNumbers{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

         n--; int i=0;
         for (int x = 0; x < n; x++)
         {
             a[i]=x+1; 
             i=n-(x+1);
         }
        for (int x = 0; x < n; x++)
        {
            System.out.print(a[x]+" ");
        }
    }
}

// #include <iostream>
// using namespace std;

// #include "solution.h"

// void arrange(int *arr, int n)
// {
//     //Write your code here
//     int val=1;
//     int start = 0 ,end = n-1;
//     while(start<=end){
//         if(val%2==1){
//     arr[start]=val;
//     val++;
//     start++;
//   }  
//         else{
//             arr[end]=val;
//     val++;
//     end--;
//         }
//     }
// }
