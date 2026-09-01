class Solution {
    public int missingMultiple(int[] nums, int k) {
      
       Set<Integer> set  = new HashSet<>();
       for(int x : nums)
       {
        set.add(x);
       }
       for(int i=1;i<102;i++)
       {
            int mul = k*i;
            if(!set.contains(mul))
                return mul;
       }
       return -1;
    }
}