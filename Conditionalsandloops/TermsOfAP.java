import java.util.Scanner;

class TermsOfAP{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int count=0, n=1;
        while(count<=x){
            int t = 3*n++ + 2;

            if(t%4==0)
            continue;
            System.out.print(t+ " ");
            count++;

        }

        
    }
}
