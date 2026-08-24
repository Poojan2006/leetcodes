class Solution {
    public long splitArray(int[] nums) {
     
        long sum1=0;
        long sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            boolean prime = true;
            if(i<2)
                prime=false;
            else{
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                    prime=false;
            }
            }
            if(prime)
                sum1+=nums[i];
            else
                sum2+=nums[i];

        }

    return Math.abs(sum1-sum2);
        
    }
}