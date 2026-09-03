class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int p=1;
        for(int i=0;i<nums.length;i++)
        {   
            result[i]=p;
            p=p*nums[i];
        }
        int s=1;
        for(int j=nums.length-1;j>=0;j--)
        {   
            result[j]=result[j]*s;
            s=s*nums[j];
        }
        return result;
    }
}