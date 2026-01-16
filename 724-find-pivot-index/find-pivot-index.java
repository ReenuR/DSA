class Solution {
    public int pivotIndex(int[] nums) {
        //int index = -1;
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;  i< nums.length; i++){
            rightSum += nums[i];
        }   
        for(int i = 0; i<nums.length; i++){
            rightSum -=nums[i];
            if(leftSum == rightSum)
                return i;
            leftSum += nums[i];
            if(i== nums.length - 1)
                rightSum = 0;
        }
        return -1;
    }
}