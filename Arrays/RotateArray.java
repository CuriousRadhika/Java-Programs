import java.util.Scanner;

class RotateArray{

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
    public static void print(int[] a)
    {
        for(int x=0 ; x<a.length ; x++)
        {
            System.out.print(a[x]+" ");
        }
        
    }
    
    public static void rotatearrayleft(int[] nums, int k)
    {
        for(int x=1 ; x<=k ; x++)
        {
            int t = nums[0];
            for(int y=1 ; y<nums.length ; y++)
            {
                nums[y-1] = nums[y];
            }
            nums[nums.length-1]=t;
        }
    }
    public void rotatearrayright(int[] nums, int k) {
        
        for(int x=1 ; x<=k ; x++)
        {
            int t = nums[nums.length-1];
            for(int y = nums.length-2 ; y>=0 ; y--)
            {
                nums[y+1] = nums[y];
            }
            nums[0]=t;
        }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1 ; x<=t ; x++)
        {
            int a[] = input();
            int n = sc.nextInt();
            rotatearrayleft(a, n);
            print(a);
          
            
        }
    }
}

