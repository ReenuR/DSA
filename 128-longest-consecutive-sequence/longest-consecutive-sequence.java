class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 0;

        HashSet<Integer> set = new HashSet<>();
        //Create a set of all the numbers
        for(int num : nums){
            set.add(num);
        }
        int currentNum = 0;
        int currentLen = 0;
        //find first num of sequence
        for(int num : set){

            if(!set.contains(num-1)){
                currentNum = num+1;
                currentLen = 1;
            }
            while(set.contains(currentNum)){
                currentLen += 1;
                currentNum += 1;
            }
            maxLen = Math.max(maxLen, currentLen);
        }
        return maxLen;
    }
}
/**There could be many sequences so i have to find the longest one*/