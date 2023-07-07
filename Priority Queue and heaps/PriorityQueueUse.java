public class PriorityQueueUse {
    public static void main(String[] args) throws Exception{
        PriorityQueue pq = new PriorityQueue();
        int arr[] = {10,5,15,2,4,20};
        for(int i=0 ; i<arr.length ; i++) // O(nlogn) = n elements*insertion of one element 
        {
            pq.insert(arr[i]);
        }
        while(!pq.isEmpty())  // O(nlogn)
        {
            System.out.print(pq.removeMin()+" ");
        }
        System.out.println();
    }
}
