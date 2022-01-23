import java.util.Scanner;

class FtoC{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();

        for(int x=S ; x<=E ; x+=W)
        {
            System.out.println(x+"\t"+(int)(5.0/9 * (x-32)));
        }
        
    }
}
