import java.util.ArrayList;

public class PriorityQueue {
    private ArrayList<Integer> heap;
    
    public PriorityQueue()
    {
        heap = new ArrayList<>();
    }
    
    boolean isEmpty() {
        return heap.size() == 0;
    }
    
    int size() {
        return heap.size();
    }
    
    int getMin() throws Exception{
        if (heap.isEmpty()) {
            // Throw an exception
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }
    
    void insert(int element)
    {
        heap.add(element);
        int childIndex  = heap.size() -1;
        int parentIndex = (childIndex-1)/2;
        
        while(childIndex>0)
        {
            if(heap.get(childIndex)<heap.get(parentIndex))
            {
                int t = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, t);
                
                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;
            }
            else{
                return;
            }
        }
    }
    int removeMin() throws Exception
    {
        if (heap.isEmpty()) {
            // Throw an exception
            throw new PriorityQueueException();
        }
        int t = heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int index=0;
        int minIndex=index;
        int leftChildIndex = 1;
        int rightChildIndex = 2;
        
        while(leftChildIndex<heap.size())//range ke andar i.e until we reach the end of heap
        {
            if(heap.get(leftChildIndex)<heap.get(minIndex))
            {
                minIndex = leftChildIndex;
            }
            if(rightChildIndex<heap.size() && heap.get(rightChildIndex)<heap.get(minIndex))
            {
                minIndex = rightChildIndex;
            }
            
            if(minIndex==index)// we don't have to go any furthur , priority of root is minimum so we don't need to heapify furthur
            {
                break;
            }
            else
            {
                int t1 = heap.get(index);
                heap.set(index , heap.get(minIndex));
                heap.set(minIndex, t1);

                index=minIndex;
                leftChildIndex = 2*index+1;
                rightChildIndex = 2*index+2;
            }
        }
        return t;
    }
}