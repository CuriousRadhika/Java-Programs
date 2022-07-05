import java.util.Scanner;
public class AssignmentLL1 {

    public static Node<Integer> takeInput()
    {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head=null;
        int data = sc.nextInt();
        while(data!=-1){
            Node<Integer> newNode = new Node<Integer>(data);
            if(head==null){
                head=newNode;
            }
            else{
                Node<Integer> temp = head;
                while(temp.next!= null)
                {
                    temp=temp.next;
                }
                temp.next=newNode;
            }
            data=sc.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static int getIndex(Node<Integer> head, int data)
    {
        int i=0;
        while(head!=null)
        {
            if(head.data==data)
            {
                return i;
            }
            head=head.next;
            i++;
        }
        return -1;
    }

    public static Node<Integer> appendNtoFront(Node<Integer> head, int n)
    {
        int c=0;
        Node<Integer> tail = head;
        while(tail.next!=null)
        {
            tail=tail.next;
            c++;
        }
        Node<Integer> temp=head;
        for (int x = 0; x <(c-n); x++)
        {
            temp=temp.next;
        }

        tail.next=head;
        head=temp.next;
        temp.next=null;

        return head;

    }
    public static void eliminateDuplicates(Node<Integer> head)
    {
        Node<Integer> temp=head;
        while(temp.next!=null)
        {
            if(temp.data == temp.next.data)
            
                temp.next=temp.next.next;
            else
            temp=temp.next;
        }
    }
   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1;x<=t;x++)
        {
            Node<Integer> head = takeInput();
            // System.out.println(getIndex(head, data));
          eliminateDuplicates(head);
           print(head);

        }
    }
    
}
