class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder sb = new StringBuilder();
        if(n==0)
             return 1;
        
        while(n>0)
        {
            
            int r = n%2;
            sb.append(r);
            n=n/2;
        }
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='0')
                sb.setCharAt(i,'1');
            else
                sb.setCharAt(i,'0');
        }
         String s=sb.reverse().toString();
        return Integer.parseInt(s,2);
    }
}