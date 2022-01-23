import java.util.Scanner;

class sumofevenandodd{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int se=0, so=0;
        for(int x=n ; x!=0 ; x/=10)
        {
            int d = x%10;
            if(d%2==0)
            se+=d;
            else
            so+=d;
        }
        System.out.println(se+" "+so);
    }
}
