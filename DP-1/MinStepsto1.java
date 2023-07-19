class MinStepsto1
{
    // public static int reduce(int n,int c)// not work everytime, fails for n=10
    // {
        
    //     if(n==1)
    //     {
    //         return c;
    //     }
    //    if(n%2!=0)
    //     {
    //         if(n%3==0)
    //         {
    //             n/=3;
    //         }
    //         else{
    //             n-=1;

    //         }
    //         c++;
    //     }
    //     else 
    //     {
    //         n/=2;
    //         c+=1;

    //     }

    //     return reduce(n,c);
    // }
    // public static int reduce(int n)
    // {
    //     int c=0;
    //     return reduce(n,c);
    // }
        public static int countSteps(int n){// normal recursive , see copy for memoization approach
            if(n==1)
            {
                return 0;
            }
            int op1 = countSteps(n-1);
            int minSteps=op1;
            if(n%3==0)
            {
                int op2 = countSteps(n/3);
                if(op2<minSteps)

                {
                    minSteps = op2;
                }
            }
            if(n%2==0)
            {
                int op3 = countSteps(n/2);
                if(op3<minSteps)
                {
                    minSteps = op3;
                }
            }
            return 1+minSteps;
        }
        public static int countStepsDP(int n)
        {
            int storage[] = new int[n+1];
            storage[1]=0;

            for (int i=2 ; i<=n ; i++)
            {
                int min = storage[i-1];
                if(i%3==0)
                {
                    if(min>storage[i/3])
                    {
                        min = storage[i/3];
                    }
                }
                if(i%2==0)
                {
                   if(min>storage[i/2])
                    {
                        min = storage[i/2];
                    }
                }
                storage[i] = 1+min;
            }
            return storage[n];
        }

    public static void main(String[] args)
    {
        int n = 10;
        System.out.println(countStepsDP(n));
    }
}