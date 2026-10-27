class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expsum=n*(n+1)/2;
        int cursum=0;
        for(int i=0;i<n;i++)
        {
            cursum+=nums[i];
        }
     return expsum-cursum;   
    }
}