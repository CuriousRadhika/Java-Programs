import java.util.Scanner;
public class GatherRainWater {

    public static int[] input()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int x=0 ; x<a.length ; x++)
        {
            a[x] = sc.nextInt();
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = input();

        int li=0 , si=0; 
        for(int x=1 ; x<a.length ; x++)
        {
            if(a[x]>a[li])
            {
                si=li;
                li=x;
            }
            else if(a[x]<a[li] && a[x]>a[si])
            {
                si=x;
            }
        }

        System.out.println(si);
        System.out.println(li);
    }
}
