class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
    double maxAvg = Double.NEGATIVE_INFINITY;

    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];

        if (i >= k) {
            sum -= nums[i - k];
        }

        if (i >= k - 1) {
            maxAvg = Math.max(maxAvg, sum);
        }
    }

    return maxAvg / k;
    }
}