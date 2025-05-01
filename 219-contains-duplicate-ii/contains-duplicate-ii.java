class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         // need to scan an array till I find a duplicate. and then  I 've to check whether abs(i-j) <=k
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0, j =0; i<nums.length; i++){
            // #expand the window
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);

            while(map.get(num) > 1){
                if(nums[j] == num && Math.abs(i-j) <= k)
                    return true;
                map.put(nums[j], map.get(nums[j])- 1);
                j++;
            }
            
        }
        return false;
    }
}