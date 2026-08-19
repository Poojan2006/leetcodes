class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        int ind =0;
        sub(nums,ind, new ArrayList<>(),ans);
        return ans;
    }


        public void sub(int [] arr, int ind,List<Integer> list,List<List<Integer>> ans)
        {
            if(ind==arr.length){
                ans.add(new ArrayList<>(list));
                return;
            }
            list.add(arr[ind]);
            sub(arr,ind+1,list,ans);
            list.remove(list.size()-1);
             sub(arr, ind + 1, list, ans);
        }
      
}