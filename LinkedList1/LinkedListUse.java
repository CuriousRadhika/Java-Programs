import java.util.Scanner;

public class LinkedListUse {

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node<Integer> takeInput1() {// O(n^2)

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
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

    public static Node<Integer> takeInput() { // O(n)

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> insertNode(Node<Integer> head, int data, int pos) throws Exception {

        Node<Integer> newNode = new Node<Integer>(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        int i = 0;
        Node<Integer> temp = head;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;// in LL always make links before breaking
        temp.next = newNode;
        return head;

    }

    public static Node<Integer> delNode(Node<Integer> head, int pos) {
        if (pos == 0) {
            return head.next;
        }
        int i = 0;
        Node<Integer> temp = head;
        while (i < pos - 1) {
            temp = temp.next;
            i++;

            if (temp.next == null)
                return head;// if pos>length of LL it will print same LL wihtout change
        }

        temp.next = temp.next.next;

        return head;
    }

    public static int length(Node<Integer> head) {
        int l = 0;
        while (head != null) {
            head = head.next;
            l++;
        }
        return l;
    }

    public static int getData(Node<Integer> head, int i) {

    }

    public static void main(String[] args) {
        // Node<Integer> node1 = new Node<Integer>(10);
        // Node<Integer> head = node1;
        // Node<Integer> node2 = new Node<Integer>(20);
        // node1.next = node2;
        // Node<Integer> node3 = new Node<Integer>(30);
        // node2.next = node3;
        Node<Integer> head = takeInput();
        // head = insertNode(head , 80 ,6);
        // head = delNode(head , 6);

        System.out.println(length(head));
        // print(head);
    }
}
