import java.util.Scanner;

class p3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("");

        for(int x=1 ; x<=n ; x++)
        {
            for(int y=1 ; y<=(n*2-1) ; y++)
            {
                if((x+y)>=(n*2-2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
