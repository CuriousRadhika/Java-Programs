
public class StackUse {
    public static void main(String[] args) throws StackFullException
    {
    //     StackUsingArray stack = new StackUsingArray();
    //     System.out.println(stack.size());
    //    for (int i = 1; i <=5 ; i++)
    //    {
    //     stack.push(i);
    //    }
    //    System.out.println(stack.size());
    //    while(!stack.isEmpty())
    //    {
    //     try
    //     {

    //        stack.pop();
    //     }
    //     catch (Exception e)
    //     {
    //         //We will never reach here
    //     }
    // }
    
    // System.out.println(stack.size());

    // StackUsingArrayDoubleCapacity stack = new StackUsingArrayDoubleCapacity();
    // System.out.println(stack.size());

    //     for (int i = 1; i <=10 ; i++)
    //    {
    //     stack.push(i);
    //    }

    //    System.out.println(stack.size());
    //    for (int i = 1; i <=5 ; i++)
    //    {
    //     stack.push(i);
    //    }
    //    System.out.println(stack.size());

    StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<Integer>();
    stack.isEmpty();
    stack.size();

    for (int i = 1; i <=10 ; i++)
       {
        stack.push(i);
       }

       System.out.println(stack.size());
       for (int i = 1; i <=5 ; i++)
       {
        stack.push(i);
       }
       System.out.println(stack.size());


}
}
