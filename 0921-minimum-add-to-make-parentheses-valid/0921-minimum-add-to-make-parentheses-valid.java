class Solution {
    public int minAddToMakeValid(String s) {
        int o =0;
        int c =0;
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='(')
                o++;
            else if(s.charAt(i)==')' && o>0)
            {
                o--;
            }
            else
               c++;
            i++;
        }
        return o+c;

        
    }
}