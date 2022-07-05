import java.util.Scanner;

public class LL2 {
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

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static int midpoint(Node<Integer> head) {
        Node<Integer> slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static Node<Integer> merge(Node<Integer> h1, Node<Integer> h2) {
        Node<Integer> t1 = h1, t2 = h2, h3 = h1, t3 = h1;

        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {

                if(t1==h1)
                t1=t1.next;

                t3.next = t1;
                t3 = t1;
                t1 = t1.next;
            } else {

                if(t2==h2)
                t2=t2.next;

                t3.next = t2;
                t3 = t2;
                t2 = t2.next;
            }

        }
        if(t1!=null) 
        t3.next=t1;
        else
        t3.next=t2;

        return h3;

        
    }
    public static void printrecursive(Node<Integer> head)
    {
        if(head==null)
        return;

        System.out.print(head.data + " ");
        printrecursive(head.next);
    }

    public static void print_recursive_reverse(Node<Integer> head)
    {
        if(head==null)
        return;

        print_recursive_reverse(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node<Integer> head = takeInput();
        // System.out.println(midpoint(head));

        // Node<Integer> h1 = takeInput();
        // Node<Integer> h2 = takeInput();
        // Node<Integer> h3 = merge(h1, h2);
        // System.out.println();
        // print(h3);

        printrecursive(head);
        System.out.println();
        print_recursive_reverse(head);
        

    }

}
