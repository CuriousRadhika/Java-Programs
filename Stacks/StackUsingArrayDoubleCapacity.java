
public class StackUsingArrayDoubleCapacity {
    private int data[];
    int top;

    public StackUsingArrayDoubleCapacity() {
        data = new int[l];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public int top() throws StackEmptyException {
        if (size() == 0) {
            // StackEmptyException e = new StackEmptyException();
            // throw e;

            throw new StackEmptyException();
        }
        return data[top];
    }

    public void push(int n) {
        if (size() == data.length) {
            doubleCapacity();
        }
        data[++top] = n;
    }

    private void doubleCapacity() {
        int temp[] = data;

        data = new int[temp.length * 2];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    public int pop() {
        return data[top--];
    }

}
