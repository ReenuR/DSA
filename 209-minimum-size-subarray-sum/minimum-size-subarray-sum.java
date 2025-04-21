class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left =0, right =0;
        int sum = 0;

        while(right < nums.length){
            sum += nums[right];

            while(sum >= target){
                sum -= nums[left];
                minLen = Math.min(minLen, right-left+1);
                left++;
            }
            
            right++;
        }
        return left==0 && right == nums.length? 0: minLen;
    }
}