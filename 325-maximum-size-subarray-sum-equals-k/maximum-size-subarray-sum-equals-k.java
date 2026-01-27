class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        
        HashMap<Integer, Integer> seen = new HashMap<>();
        int maxLen = 0;
        int cummSum = 0;

         for(int i=0; i<nums.length; i++){
            cummSum += nums[i];
            int complemntK = cummSum - k;
            if(cummSum == k)
                maxLen = Math.max(maxLen, i+1);
            if(seen.containsKey(complemntK)){
                maxLen = Math.max(maxLen,i-seen.get(complemntK));
            }
            
                seen.putIfAbsent(cummSum, i);
            
        }
        
        return maxLen;
    }
}
// I need to find a sum(i,j) == k, which is prefix[j] - prefix[i-1] = k ==> prefix[i-1] = prefix[j] - k;