class Solution {
    public boolean isPowerOfTwo(int n) {
        String binary = Integer.toBinaryString(n);
        int c =0;
        if(n<=0)
          return false;
        for (char b : binary.toCharArray())
        {
            if(b=='1')
               c++;
        }
        return c==1;
        
    }
}