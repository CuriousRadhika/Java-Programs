
public class StackUsingArray {

    private int data[];
    int top ;
    public StackUsingArray()
    {
        data=new int[10];
        top = -1;
    }
    public StackUsingArray(int capacity)
    {
        data=new int[capacity];
        top = -1;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public int size()
    {
        return top+1;
    }
    public int top() throws StackEmptyException
    {
        if(size()==0)
        {
            // StackEmptyException e = new StackEmptyException();
            // throw e;

            throw new StackEmptyException();
        }
        return data[top];
    }
    public void push(int n) throws StackFullException
    {
        if(size()==data.length){

            throw new StackFullException();
        }
        data[++top] = n;
    }
    public int pop(){
        return data[top--];
    }
}
