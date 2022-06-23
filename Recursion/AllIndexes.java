import java.util.Scanner;


public class AllIndexes {
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
    
    public static void allIndexes(int a[] , int x , int i[], int startIndex , int ptr)
    {
        if(startIndex >= a.length)
        return;

        else if(a[startIndex] == x)
        {
            i[ptr++] = startIndex;
        }

        allIndexes(a , x , i , startIndex+1 , ptr);
        
    }
    public static void allIndexes(int a[] , int x , int i[])
    {
        allIndexes(a, x, i , 0,0);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
            int a[] = input();
            int x = sc.nextInt();
            int i[] = new int[a.length];
            for(int j=0 ; j<a.length ; j++)
            {
                i[j]=-1;
            }
            allIndexes(a,x,i);
            for(int j=0 ; j<a.length ; j++)
            {
                if(i[j]!=-1)
                System.out.print(i[j]+" ");
            }          
    } 
}
