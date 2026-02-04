class Solution {
    public int lengthOfLongestSubstring(String s) {
         int maxLen = 0;

        HashSet<Character> set = new HashSet<>();
        //add letter to set, keep adding untill u find duplicate.
        for(int l=0, r=0; r<s.length(); r++){

            char ch =s.charAt(r);

            //if duplicate found, start removing charcters from left and store maxLen
            while(set.contains(ch)){
                char chLeft = s.charAt(l);
                set.remove(chLeft);
                l++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}

