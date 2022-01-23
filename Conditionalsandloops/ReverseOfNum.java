import java.util.Scanner;

class ReverseOfNum{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int x = n ; x!=0 ; x/=10){
            int d = x%10;
            System.out.print(d);
        }
        
    }
}
