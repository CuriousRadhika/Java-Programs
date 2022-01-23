import java.util.Scanner;

class CheckNumberSequence1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=5;
        int arr[] = new int[n];
        for(int x = 0; x < n; x++)
        {
            arr[x] = sc.nextInt();
        }
        for(int x = 0; x < n-1; x++)
        {
            if(arr[x]<arr[x+1])
            {
                // if(a==-1){
                //     a=0;
                //     break;
                // }
                a=1;   
            }
            else if(arr[x]>arr[x+1])
            {
                if(a==1){
                    a=0;
                    break;
                }
                 a=-1;
            }
            else
            {
                a=0;
                break;
            }
        }

        if(a==0)
        System.out.println("false");
        else
        System.out.println("true");
    }
}
