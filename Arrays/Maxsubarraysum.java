class Maxsubarraysum
{
    public int maxSubArray1(int[] nums) //O(n3)
    {
         if(nums == null || nums.length == 0)
            return 0;

        int max=nums[0], l = nums.length-1;
        for(int z=0 ; z<=l ; z++)
        {
            
            for(int x=z;x<=l;x++)
            {
                int s=0;
                for(int y=z ; y<=x  ; y++)
                {
                    s+=nums[y];

                }
                if(s>max)
                {
                    max=s;
                }
                
            }
        }
        return max;
        
    }
    public int maxSubArray2(int[] nums) //O(n2)
    {
       
        int max=nums[0], l = nums.length-1;
        for(int z=0 ; z<=l ; z++)
        {
              int s=0;
            
            for(int x=z;x<=l;x++)
            {
              
                
                    s+=nums[x];

               
                if(s>max)
                {
                    max=s;
                }
                
            }
        }
        return max;
        
    }
    public int maxSubArray3(int[] nums) //O(3) Kadane's Algo
    {
         int max=Integer.MIN_VALUE, sum=0;
        for(int x=0 ; x<nums.length ; x++)
        {
           sum+=nums[x];

           if(sum>max)
           max=sum;

           if(sum<0)
           sum=0;
        }
        return max;
        
    }
}