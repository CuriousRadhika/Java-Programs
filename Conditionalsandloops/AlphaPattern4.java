import java.util.Scanner;


class AlphaPattern4{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for(int x=1 ; x<=n ; x++) {
            for(int y=1 ; y<=x ; y++) {
                System.out.print((char)(x+64));

            }
            
            System.out.println();
        }

      
    }
}
