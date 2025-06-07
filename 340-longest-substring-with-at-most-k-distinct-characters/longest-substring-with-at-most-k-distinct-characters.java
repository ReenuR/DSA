class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int maxLen = -1;
        int left = 0;
        int len = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++){

            char r = s.charAt(right);
            map.put(r, map.getOrDefault(r, 0) +1);
            
            while(map.size() > k){
                char l = s.charAt(left);
                if(map.get(l) > 1)
                    map.put(l, map.get(l)-1);
                else
                    map.remove(l);
                left++;
            }
            len = right - left + 1;

            maxLen = Math.max(len, maxLen);

        }
        return len == 0? 0: maxLen;
    }
}