import java.util.Scanner;

class InterestingAlphabets{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int x = (64+n) ; x>=65 ; x--){
            for(int y = x ; y<=(64+n) ; y++ )
            {
                System.out.print((char)y);
            }
            System.out.println();
        }
    }
}
