import java.util.Scanner;

class p1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("");

        
        for(int x=1 ; x<=n ; x++)
        {
            int c=x;
            for(int y=1 ; y<=x ; y++)
            {
                System.out.print(c++);
            }
            System.out.println();
        }
    }
}
