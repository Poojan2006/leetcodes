class Solution {
    public String removeOuterParentheses(String s) {
        String result="";
        int b =0;
        for(int i =0;i<s.length();i++)
        {   
            char c = s.charAt(i);
            if(c=='(')
            {
                b++;
                if(b>1)
                result=result+'(';
            }
            else 
                {
                    b--;
                    if(b>0)
                    {
                        result=result+')';
                    }
                }
        }
        return result;
        
    }
}