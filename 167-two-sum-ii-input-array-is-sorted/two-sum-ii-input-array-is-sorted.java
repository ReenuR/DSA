class Solution {
    public int[] twoSum(int[] num, int target) {
        for(int left = 0, right =num.length-1; left<right; ){
            int sum = num[left] + num[right];
            if( sum == target){
                return new int[] {left+1, right+1};
            }
            if(sum>target){
                right--;
            }else{
                left++;
            }

        }
        return new int[]{-1, -1};
    }
}