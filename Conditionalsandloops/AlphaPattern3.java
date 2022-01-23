import java.util.Scanner;


class AlphaPattern3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       
        for(int x=65 ; x<=(64+n) ; x++) 
        {
            for(int y=65 ; y<=x ; y++) {
                System.out.print((char)x);

            }
           
            System.out.println();
        }

      
    }
}

