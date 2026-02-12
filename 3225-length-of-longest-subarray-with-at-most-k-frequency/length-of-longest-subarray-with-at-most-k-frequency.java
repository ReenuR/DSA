class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxLen = -1;
        int freqCount;

        for(int left =0, right =0; right<nums.length; right++){
            
            freq.put(nums[right], freq.getOrDefault(nums[right],0)+1);
            freqCount = freq.get(nums[right]);

            while(freqCount > k){
                if(freq.get(nums[left]) == freqCount)
                    freqCount--;
                freq.put(nums[left], freq.get(nums[left])-1);
                if(freq.get(nums[left]) == 0)
                    freq.remove(nums[left]);
                left++;
            }
            
            maxLen = Math.max(maxLen, right-left+1);

        }
        return maxLen;
        //window invalid --> if freq > k
    }
}