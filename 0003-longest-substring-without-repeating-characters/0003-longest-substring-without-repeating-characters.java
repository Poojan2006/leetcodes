class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0;
        int n=s.length();
        int maxi=0;
        for(int r=0;r<n;r++)
        {
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxi=Math.max(maxi,r-l+1);
        }
     return maxi;   
    }
}