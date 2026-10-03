class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

         bt("",0,0,n,result);
        return result;
     }
     public void bt(String curr,int open,int close,int n,List<String> result)
     {
        if (open == n && close == n)
        {
            result.add(curr);
            return;
        }
        if(open<n)
        {
            
            bt(curr+'(',open+1,close,n,result);
        }
        if(close<open)
        {
     
            bt(curr+')',open,close+1,n,result);
        }
     }
}