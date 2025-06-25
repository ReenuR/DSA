class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0, sum = 0;
        int l = 0;
        Set<Integer> set = new HashSet<>();

        for (int r = 0; r < nums.length; r++) {
            while (set.contains(nums[r])) {
                set.remove(nums[l]);
                sum -= nums[l++];
            }

            set.add(nums[r]);
            sum += nums[r];

            if (r - l + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                set.remove(nums[l]);
                sum -= nums[l++];
            }
        }

        return maxSum;
        }
    }
    /*{
    
      int left =0;
      int right =0;
      int sum = 0;
      int maxSum = 0;
        for(right = 0,left = 0; right<nums.length; right++){
            sum += nums[right];
            if(right>0 && nums[right]==nums[right-1]){
                sum = 0;
            }
            if(right>=k-1){
                maxSum = Math.max(maxSum, sum);
                sum-= nums[left];
                left++;
            }
        }
        return maxSum;
      }   
}*/