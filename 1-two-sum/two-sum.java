class Solution {
    public int[] twoSum(int[] nums, int target) {
        // we can store element and its index in hashmap and we'll loop thru array and check if complement is present in the array or not  if yes just return the current index and map's value.
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement))
                return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}