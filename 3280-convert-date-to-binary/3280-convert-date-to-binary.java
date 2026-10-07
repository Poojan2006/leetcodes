class Solution {
    public String convertDateToBinary(String date) {
        String [] p = date.split("-");
         int y = Integer.parseInt(p[0]);
         int m = Integer.parseInt(p[1]);
         int d = Integer.parseInt(p[2]);
        return Integer.toBinaryString(y) + '-' +Integer.toBinaryString(m) + '-' + Integer.toBinaryString(d); 
        
    }
}