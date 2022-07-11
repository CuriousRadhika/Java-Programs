public class QueueUsingLL {

    private front;private rear;
    private int size;

    public QueueUsingLL(){
        private front=null;
        private rear=null;

    private int size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    T front() throws QueueEmptyException
     {
        if (front == null) //or size==0
            throw new QueueEmptyException();

        return front.data;
    }

    void enqueue(T element){

        Node<T> newNode = new Node<element>;

        if (size == 0)
        {
            front=newNode;
            rear= newNode;
            size++;
        }
        else{
        rear.next = newNode;
        rear=rear.next;
        size++;
        }
    }
    T dequeue() throws QueueEmptyException
    {
        if(size == 0){
            throw new QueueEmptyException();
        }
        T temp=front.data;
        front=front.next;
        if(size==1)
        {
            rear=null;
        }
        size--;
        return temp;
    }
}
