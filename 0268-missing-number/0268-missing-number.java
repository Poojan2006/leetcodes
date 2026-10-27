class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int expsum=0;
        int cursum=0;
        for(int i=0;i<=n;i++)
        {   expsum+=i;
        }
        for(int i=0;i<n;i++)
        {
            cursum+=nums[i];
        }
     return expsum-cursum;   
    }
}