class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int maxLen = -1;
        int left =0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);

            while(map.size() > k ){
                char charAtleft = s.charAt(left);
                map.put(charAtleft,map.get(charAtleft)-1);
                if(map.get(charAtleft) == 0)
                    map.remove(charAtleft);
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}