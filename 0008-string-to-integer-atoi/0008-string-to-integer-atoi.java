class Solution {
    public int myAtoi(String s) {
        int si=1;
        int i=0;
        int result =0;
        while(i<s.length() && s.charAt(i)==' ')
        {
            i++;
        }
        if (i < s.length() && s.charAt(i) == '+') {
            si = 1;
            i++;
        }
        else if (i < s.length() && s.charAt(i) == '-') {
            si = -1;
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i) ))
        {
            int digit = s.charAt(i) - '0';
            if(result>(Integer.MAX_VALUE-digit)/10)
            {
                if(si==1)
                   return Integer.MAX_VALUE;
                else 
                   return Integer.MIN_VALUE;
            }
            result= result*10+digit;
            i++;
        }
    return result*si;

    }
}