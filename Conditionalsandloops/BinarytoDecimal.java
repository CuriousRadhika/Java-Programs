import java.util.Scanner;

class BinarytoDecimal{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0, p=0;
        for(int x = n ; x!=0 ; x/=10,p++){
            if(x%10==1)
          sum = sum + (int)Math.pow(2, p);

          
            
        }
        

        System.out.println(sum);
    }
}
