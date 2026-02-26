class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int countZero = 0;
        int maxLenSoFar = 0;
        int left = 0;
        
        for(int right =0; right<nums.length; right++){
            if(nums[right] == 0){
                countZero ++ ;
            } 
            while(countZero > k){
                if(nums[left] == 0)
                    countZero--;
                left++;
            }
            maxLen = right - left + 1;

            maxLenSoFar = Math.max(maxLenSoFar, maxLen);
        }
        return maxLenSoFar;
    }
}
//0 0 1 1 0 1 0 1 1 --> k =2 