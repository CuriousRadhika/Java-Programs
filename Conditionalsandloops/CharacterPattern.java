import java.util.Scanner;

class CharacterPattern{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int x=1 ; x<=n ; x++)
        {
            int c=x;
            for(int y=1 ; y<=x ; y++)
            {
                System.out.print((char)((c++)+64));
            }
           
            System.out.println("");
        }
       
    }
}
