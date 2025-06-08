class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int countZero = 0;
        int maxLenSoFar = 0;
        for(int r=0, l=0; r<nums.length; r++){
            if(nums[r] == 0){
                countZero++;
            }
            
            if(countZero > k){
                if(nums[l] == 0){
                    countZero--;
                }
                l++;
            }
            maxLen = r-l+1;
            maxLenSoFar = Math.max(maxLenSoFar,maxLen);
        }
        return maxLenSoFar;
    }
}