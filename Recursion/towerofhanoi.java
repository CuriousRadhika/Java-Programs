import java.util.Scanner;
public class towerofhanoi {
    public static void toi(int n , char a , char b , char c)
    {
        if(n==1)
        System.out.println(a+" "+c);
        else
        {
            toi(n-1 , a ,c ,b);
            System.out.println(a+" "+c);
            toi(n-1 , b, a ,c);
        }

        
    }
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
    
            toi(sc.nextInt(), 'a', 'b', 'c');
        }
}
