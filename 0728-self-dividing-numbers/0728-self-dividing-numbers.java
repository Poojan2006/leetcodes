class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
       
        for(int i=left;i<=right;i++)
        {
                String s = String.valueOf(i);
                char [] ch = s.toCharArray();
                boolean b = true;
                for(int j=0;j<ch.length;j++)
                {
                    int d = ch[j]-'0';
                    if(d==0 || i%d!=0)
                        b=false;
                }
                if(b)
                  result.add(i);
            
        }
        return result;
        
    }
}