class Solution {
    public void moveZeroes(int[] nums) {
       int p0 = 0;
       for(int i = 0; i<nums.length; i++ ){
        if(nums[i] == 0){
            p0 = i;
            for(int j = i+1; j<nums.length; j++){
                if(nums[j] != 0 ){
                    nums[p0] = nums[j];
                    nums[j] = 0;
                    break;
                }
            }
        }
       }
    }
}

