import java.util.*;
import java.io.*;
public  class output{

    public static void fun(Node<Integer> start)
    {
      if(start == null)
        return;
      System.out.print( start.data+" ");
    
      if(start.next != null )
        fun(start.next.next);
      System.out.printf(start.data+" ");
    }

    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = null;
        int data = sc.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
   public static void main(String args[]){
   
       Node<Integer> head = takeInput();
       fun(head);
       
      
   }
}