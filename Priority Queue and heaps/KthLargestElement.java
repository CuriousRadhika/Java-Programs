import java.util.PriorityQueue;
public class KthLargestElement {
     public static void printKthlargestElement(int arr[],int k)
    {
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int i=0 ; 
        for(; i<k ; i++)
        {
            pq.add(arr[i]);
        }
        for(; i<arr.length ; i++){
            int min=pq.element();
            if(min<arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        
            System.out.println(pq.element());
        
    }
    public static void main(String[] args) {
        int arr[] = {2,15,8,9,12,13,20};
        printKthlargestElement(arr, 3);
    }
}
