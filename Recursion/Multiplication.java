import java.util.Scanner;
public class Multiplication {

    public static int multiply(int a, int b)
    {
        if(b==0)
        return 0;
        else
        return a + multiply(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(multiply(a, b));
    }
}
