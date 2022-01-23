import java.util.Scanner;


class AlphaPattern{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char c = 'A';
        for(int x=1 ; x<=n ; x++) {
            for(int y=1 ; y<=x ; y++) {
                System.out.print(c);

            }
            c++;
            System.out.println();
        }

      
    }
}
