public class StackUsingLinkedList<T> {

    private Node<T> head;
    private int size;

    int size() {
        return size;
    }
    T top() {
        if(isEmpty())// size==0 or head==null
        throw new StackEmptyException();
        
        return head.data;
    }
    boolean isEmpty() {
        return head==null; // size==0;

    }
    void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next=head;
        head=newNode;
        size++;

    }
    T pop() {
        if(isEmpty())
         throw new StackEmptyException();

        T temp = head.data();
        head=head.next;
        size--;
        return temp;
        

    }
    
}
