class Solution {
    public int findComplement(int num) {
       StringBuilder sb = new StringBuilder();
       if(num==0)
        return 0;
        while(num>0)
        {
            int r = num%2;
            sb.append(r);
            num=num/2;
        }
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='0')
                sb.setCharAt(i,'1');
            else
                sb.setCharAt(i,'0');
        }
        String s = sb.reverse().toString();
        return Integer.parseInt(s,2);
    }
}