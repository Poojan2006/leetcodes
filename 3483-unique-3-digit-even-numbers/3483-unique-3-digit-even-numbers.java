class Solution {
    public int totalNumbers(int[] digits) {
        int c=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<digits.length;i++)
        {
            for(int j=0;j<digits.length;j++)
            {
                for(int k=0;k<digits.length;k++)
                {
                    int a =0;
                    if(i!=j && i!=k && j!=k && digits[i]!=0 && digits[k] % 2 ==0)
                         a= digits[i] * 100 + digits[j]*10+digits[k];
                        set.add(a);
                }
            }
        }
        return set.size()-1;
    }
}