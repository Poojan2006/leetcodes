class Solution {
    public int hammingWeight(int n) {
        String bin = Integer.toBinaryString(n);
        int count =0;
        for(int i=0;i<bin.length();i++)
        {
        if(bin.charAt(i)=='1')
            count++;
        }

  return count;


        
    }
}