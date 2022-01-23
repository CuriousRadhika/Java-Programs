import java.util.Scanner;


class AlphaPattern2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       
        for(char x = 'A'; x<= (char)(65+n-1) ; x++) 
        {
            for(char y = 'A'; y<= x ; y++) {
                System.out.print(x);

            }
           
            System.out.println();
        }

      
    }
}

