class Solution {
    public double findMaxAverage(int[] nums, int k) {
      double sum = 0.0;
      double maxSum = Integer.MIN_VALUE;

      for(int right = 0, left = 0; right<nums.length; right++){
        sum += nums[right];
        if(right >= k-1){
            maxSum = Math.max(maxSum,sum);
            sum -= nums[left++];
        }
      }
      return maxSum/k;
    }
}