class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLen = 0;
        int left =0; 
        Map<Character, Integer> map = new HashMap<>();

        for(int right = 0; right< s.length(); right++){
            //keep adding untill I find duplicate.
            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar,0)+1);

            //  #shrink --> keep shrinking until I remove the duplicate item   
            while(map.get(currentChar) > 1){
                char charAtLeft = s.charAt(left);
                if(map.get(charAtLeft)>1){
                    map.put(charAtLeft, map.get(charAtLeft)-1);
                }
                else{
                    map.remove(charAtLeft);
                }
                
                left++;
            }
            maxLen = Math.max(maxLen, map.size());
        }
        return maxLen;
       
    }
}

