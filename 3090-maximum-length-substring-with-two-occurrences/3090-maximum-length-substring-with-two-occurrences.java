class Solution {
    public int maximumLengthSubstring(String s) {
        int [] f = new int[26];
        int l=0;
        int maxlength=0;
        for(int r=0;r<s.length();r++)
        {   char ch=s.charAt(r);
            f[ch - 'a']++;
           while(f[ch-'a']>2)
            {
                f[s.charAt(l) - 'a']--;
                l++;
            }
            maxlength=Math.max(maxlength,r-l+1);
         
        }
        return maxlength;
    }
}