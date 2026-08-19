class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean [] used = new boolean[nums.length]; 
        per(nums,used,new ArrayList<>(),result);
        return result;
    }
    public void per(int [] nums,boolean[] used,List<Integer>list,List<List<Integer>>result){
         if(list.size()==nums.length)
           {
             result.add(new ArrayList<>(list));
              return;
            }
        for(int i=0;i<nums.length;i++)
        { 
            if(used[i])
                continue;
            
           list.add(nums[i]);
           used[i]=true;
           per(nums,used,list,result);
           list.remove(list.size()-1);
           used[i]=false;
        }
    }
}