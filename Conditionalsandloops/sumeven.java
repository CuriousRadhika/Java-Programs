

import java.util.Scanner;

class sumeven{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // if(n%2!=0)
        // n--;
        //this is not required

            int sum=0;
        for(int x=2 ; x<=n ; x+=2)
        sum+=x;

        System.out.println(sum);
    }
}
