import java.util.Scanner;

class CharacterPattern2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       for(int x=65 ; x<(65+n); x++)
       {
        
           for(int y=x ; y<(x+2); y++)
           {
            int c=x;
               System.out.print((char)(c++));
           }
           System.out.println();
       }
       
    }
}