class Solution {
    public void moveZeroes(int[] nums) {
        int zeroPos = 0;
        for(int pos = 0; pos<nums.length; pos++){
                if(nums[pos] != 0 ){
                    if( zeroPos != pos){
                    nums[zeroPos] = nums[pos];
                    nums[pos] = 0;
                    }
                    zeroPos++;;
                }
    }
    }
}

