import java.util.Scanner;

class totalSalary{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
           double bs = sc.nextDouble();

            char c = sc.next().charAt(0);

            double hra = 0.2 * bs, da = 0.5 * bs , pf = 0.11* bs , allow;
            
            if(c=='A')
             allow = 1700;
            else if(c=='B')
             allow = 1500;
            else if(c=='C')
             allow = 1300;
            else
            return;

            double totalSalary = bs+hra+da+allow - pf;


            System.out.println(Math.round(totalSalary));
        
    }
}
