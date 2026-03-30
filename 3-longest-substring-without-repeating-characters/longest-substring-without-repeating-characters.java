class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        for(int left =0, right = 0; right<s.length(); right++){
            char currCh = s.charAt(right);
        
            while(set.contains(currCh)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currCh);
            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;
    }
}

