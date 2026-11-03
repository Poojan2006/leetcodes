class Solution {
    public int minMoves(int[] nums) {
        int moves=0;
        Arrays.sort(nums);
        int l = nums[nums.length-1];
        for(int i=0;i<nums.length;i++)
        {
            moves+=l-nums[i];
        }
        return moves;
    }
}