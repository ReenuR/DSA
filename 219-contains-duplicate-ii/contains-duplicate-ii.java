class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      Set<Integer> freq = new HashSet<>();
       for(int i=0; i<nums.length; i++){
            if(!freq.add(nums[i]))
                return true;
            if(freq.size()>k){
                freq.remove(nums[i-k]);
            }
       }
       return false;
    }
}