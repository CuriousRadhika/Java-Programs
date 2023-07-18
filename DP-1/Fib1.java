
public class Fib1 {

    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int fib_dp(int n)
    {
        int storage[] = new int[n+1];
        for(int x=0 ; x<=n ; x++){
            storage[x] = -1;
        }
        return fib_dp(n, storage);
    }
    public static int fib_dp(int n , int[] storage)
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
        storage[n] = fib_dp(n-1, storage) + fib_dp(n-2, storage);
        return storage[n];
    }
    public static void main(String[] args)
    {
        int n=48;
        System.out.println(fib(n));
        System.out.println(fib_dp(n));
    }
    
}
