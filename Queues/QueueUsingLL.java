public class QueueUsingLL {
    
    private front;
    private rear;
    private int size;

    public QueueUsingLL(){
        private front=null;
        private rear=null;
        private int size=0;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    T front(){
        if(front==null)
        throw new QueueEmptyException();

        return front.data;
    }
    
    void enqueue(T element){
        
        Node<T> newNode = new Node<element>;

        rear.next = newNode;
        rear=rear.next;
    }
}
