class Solution {
    public String countAndSay(int n) {
        String r = "1";
        for(int i=1;i<n;i++)
        {
            StringBuilder sb = new StringBuilder();
            int j=0;
            while(j<r.length())
            {   
                char ch= r.charAt(j);
                int c=0;
                while(j<r.length() && r.charAt(j)==ch)
                {
                c++;
                j++;
                }
                
            
            sb.append(c);
            sb.append(ch);
            }
            r=sb.toString();
        }
        return r;
    }
}