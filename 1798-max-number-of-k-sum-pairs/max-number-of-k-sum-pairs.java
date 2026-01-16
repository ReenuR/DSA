class Solution {
    public int maxOperations(int[] nums, int k) {
        int maxOp = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
             int complement = k - nums[i];
             if(map.getOrDefault(complement,0) > 0){
                map.put(complement, map.getOrDefault(complement, 0)- 1);
                maxOp++;
             }else{
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
             }
        }
        return maxOp;
    
    }
}

// BF app --> we pick each elemnt and sum it to other element n keep a count of sum==k. time complexity = o(n*n)

/*we can do it in o(n) if it is sorted. like 1 pinter on left and 1 on right. if sum is < k we move left++ n if not right-- while keeping track of hw many times we got sum = k.
n tc will be o(n log n ) + o (n) --> o(n log n).

or we can use hashmap. */