import java.util.Scanner;

class AllPrimeNumbers{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int x=2 ; x<=n ; x++){
            boolean isPrime =true;
            for(int y=2 ; y*y<=x; y++){
                if(x%y==0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            System.out.println(x);
        }
        

    
    }
}
