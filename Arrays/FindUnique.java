import java.util.Scanner;

class FindUnique{

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
    public static int findUnique1(int a[])
    {
        
        for(int x=0 ; x<a.length ; x++)
        {
            int c=0;
            for(int y=0 ; y<a.length ; y++)
            {
               if(a[x]==a[y]) 
                c++;
            }
            if(c==1)
            return a[x];
        }
        return -1;

    }
    public static int findUnique2(int a[])
    {
        
        int res = a[0];
        for (int i = 1; i < a.length ; i++)
            res = res ^ a[i];
     
        return res;

    }
    public static int findUnique3(int[] arr) {
		
		for(int i=0 ; i< arr.length;i++) {
			boolean duplicate=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					duplicate=true;
					break;
				}
			}
			if(!duplicate) {
				return arr[i];
			}
		}
		return -1;
		
	}
    // Method 4: Use hashtable
    //Method 5: Use binary search and hashmap see gfg
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0 ; x<t ; x++)
        {
            int a[] = input();
            System.out.println(findUnique4(a));
            
        }
    }
    
}
