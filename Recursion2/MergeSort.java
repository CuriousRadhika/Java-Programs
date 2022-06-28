import java.util.Scanner;

public class MergeSort {
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

    public static void divide(int[] a, int si, int ei) {
        if (si >= ei)
            return;

        int mid = (si + ei) / 2;
        divide(a, si, mid);
        divide(a, mid+1 , ei);
        conquer(a, si, ei);
    }

    public static void conquer(int[] a, int si, int ei) {
        int mid = (si + ei) / 2;
        int merged[] = new int[ei - si + 1];
        int i = 0, j = mid + 1, k = 0;
        while (i <= mid && j <= ei) {
            if (a[i] < a[j])
                merged[k++] = a[i++];
            else
                merged[k++] = a[j++];
        }
        while (i <= mid) {
            merged[k++] = a[i++];
        }
        while (j <= ei) {
            merged[k++] = a[j++];
        }

        for (int x = 0, y = si; x < merged.length; x++, y++) {
            a[y] = merged[x];
        }
    }

    public static void mergesort(int[] a) {
        divide(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = input();
        mergesort(a);
        print(a);

    }
}
