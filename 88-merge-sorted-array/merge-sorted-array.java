class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1;
        int j = n-1;
        int write = m+n-1;
        while(j >= 0){
            if(i >= 0 && (nums1[i] > nums2[j])){
                nums1[write] = nums1[i];
                i--;
            }else{
                nums1[write] = nums2[j];
                j--;
            }
            write--;
        }   
    }
}

