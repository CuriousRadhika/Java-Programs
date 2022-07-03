

// public class Node {

//     int data;
//     Node next;

//     public Node(int data)
//     {
//         this.data = data;
//     }
    
// }

public class Node<T> {

    T data;
    Node next;

    public Node(T data)
    {
        this.data = data;
        next=null;
    }
    
}
