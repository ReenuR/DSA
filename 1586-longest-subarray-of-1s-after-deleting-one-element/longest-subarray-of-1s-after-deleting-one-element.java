class Solution {
    public int longestSubarray(int[] nums) {
        int longest = 0;
        int currLongest = 0;
        int zero = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0)
                zero++;
            while(zero>1){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }
            longest = Math.max(longest, right - left + 1);
        }
        return longest-1;
    }
}