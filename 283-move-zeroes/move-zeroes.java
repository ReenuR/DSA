class Solution {
    public void moveZeroes(int[] nums) {
       int posZero = 0;
       for(int i=0 ; i<nums.length; i++){
        if(nums[i] != 0 ){
            nums[posZero] = nums[i];
            posZero++;
        }
       }

        for(int i =posZero; i<nums.length; i++){
            nums[i] = 0;
        }
      
    }
}
