import java.util.Scanner;

class MergeSort {

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

    public static int[] mergesort(int arr1[], int[] arr2) {
        int ans[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j])
                ans[k++] = arr1[i++];

            else
                ans[k++] = arr2[j++];
        }
        while(i < arr1.length)
        {
            ans[k++] = arr1[i++];
        }
        while(j < arr2.length)
        {
            ans[k++] = arr2[j++];
        }
        return ans;
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 1; x <= t; x++) {
            int a[] = input();
            int b[] = input();

            print(mergesort(a, b));

        }
    }
}