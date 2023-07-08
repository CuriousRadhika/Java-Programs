import java.util.PriorityQueue;

public class SortKSorted {
    public static void sortKsorted(int arr[] , int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); //make a new priority queue
        int i = 0;
        for(; i < k; i++) // add first k elements to heap
        {
            pq.add(arr[i]);
        }

        for(; i < arr.length; i++) // remove the first element from the heap(first is the smallest element) and add one element to the heap (k+1)th element
        {
        arr[i-k]=pq.remove();
        pq.add(arr[i]);
        }
        for(int j = arr.length -k ; j<arr.length; j++) // remove the leftover k elements from the heap
        {
            arr[j] = pq.remove();
        }
        // the size of priority queue never exceeds k so out time complexity reduces from nlogn to nlogk
    }
}
