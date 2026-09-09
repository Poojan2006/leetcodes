class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        String f = strs[0];
        String l = strs[strs.length-1];
       for(int i=0;i<f.length();i++)
       {
           if(f.charAt(i)!=l.charAt(i))
            return sb.toString();
            sb.append(f.charAt(i));
       }
     return sb.toString();
    }
}