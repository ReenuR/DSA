class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY;
        double sum = 0;

        for(int left =0 , right = 0; right < nums.length; right++){
            sum += nums[right];
            if(right >= k){
                sum = sum - nums[left];
                left++;
            }
            if(right >= k-1){
                maxAvg = Math.max(maxAvg, sum);
            }
            
            
            
        }
        return maxAvg/k;

    }
}