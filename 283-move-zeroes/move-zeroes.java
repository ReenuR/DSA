class Solution {
    public void moveZeroes(int[] nums) {
       int posZero = 0;
       for(int i=0 ; i<nums.length; i++){
        if(nums[i] != 0 ){
            nums[posZero] = nums[i];
            posZero++;
        }
       }
       while(posZero < nums.length){
        nums[posZero] = 0;
        posZero++;
       }
    }
}
