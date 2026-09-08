class Solution {
    public int countCommas(int n) {
        if(n<1000)
            return 0;
        int a = 1000;
        return (n-a)+1;
        
        
    }
}