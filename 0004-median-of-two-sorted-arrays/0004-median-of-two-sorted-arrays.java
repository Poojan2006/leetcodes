class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m[] =new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            m[k++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            m[k++]=nums2[i];
        }
        Arrays.sort(m);
        int low=0;
        int high=m.length-1;
        
        int mid=low+(high-low)/2;
        if(m.length%2==0)
        {
           return (m[mid]+m[mid+1])/2.0;
        }
        
             return m[mid];
    }
}