class Solution {
    public boolean isPalindrome(int x) {
        int n=0;
        int t=x;
        boolean b;
        while(x>0)
        {
            int d=x%10;
            n=n*10+d;
            x=x/10;
        }
        if(t==n)
        {
            b=true;
        }
        else
            b=false;
        return b;
        
    }
}