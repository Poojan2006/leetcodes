class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map= new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Character>[] bucket = new ArrayList[s.length()+1];
        for(Map.Entry<Character,Integer> m : map.entrySet())
        {
            char ch = m.getKey();
            int f = m.getValue();
            if(bucket[f]==null)
                bucket[f]=new ArrayList<>();
            bucket[f].add(ch);
        }
        for(int j=bucket.length-1;j>=1;j--)
        {
            if(bucket[j]!=null)
            {
            for(char ch : bucket[j])
            {
                for(int i=0;i<j;i++)
                {
                    sb.append(ch);
                }
            }
            }
        }
        return sb.toString();
        
    }
}