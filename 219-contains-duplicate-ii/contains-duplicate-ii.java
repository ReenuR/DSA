class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       Map<Integer, Integer> freq = new HashMap<>();
       for(int i=0; i<nums.length; i++){
            if(freq.containsKey(nums[i]))
                return true;
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
            if(freq.size()>k){
                freq.remove(nums[i-k]);
            }
       }
       return false;
    }
}