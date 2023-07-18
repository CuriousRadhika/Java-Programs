
public class Fib1 {

    public static int fib(int n)// fib recursive
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int fibM(int n)// fib memoization
    {
        int storage[] = new int[n+1];
        for(int x=0 ; x<=n ; x++){
            storage[x] = -1;
        }
        return fibM(n, storage);
    }
    public static int fibM(int n , int[] storage)
    {
        if(n==0|| n==1)
        {
            storage[n]=n;
            return storage[n];
        }
        if(storage[n]!=-1)
        {
            return storage[n];
        }
        storage[n] = fibM(n-1, storage) + fibM(n-2, storage);
        return storage[n];
    }
    public static int fibDP(int n)// fib DP approach
    {
        int storage[] = new int[n+1];
        storage[0]=0;
        storage[1]=1;
        for(int x=2 ; x<=n ; x++)
        {
            storage[x] = storage[x-1]+storage[x-2];
        }
        return storage[n];

    }
    public static void main(String[] args)
    {
        int n=40;
        System.out.println(fib(n));
        System.out.println(fibM(n));
        System.out.println(fibDP(n));
    }
    
}
