class Solution {
    public String minWindow(String s, String t) {
        int minLen = Integer.MAX_VALUE;

        if (t.length() > s.length())
            return "";

        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }
        int matched = 0;
        int minLeft = 0, minRight = 0;
        for (int left = 0, right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
            if (tMap.containsKey(ch)) {
                if (windowMap.get(ch).equals( tMap.get(ch)))
                    matched++;
            }

            //Found valid window - that contains all the characters of t
            while (matched == tMap.size()) {

                if (right - left + 1 < minLen) {
                    minLeft = left;
                    minRight = right;
                    minLen = right - left + 1;
                }
                char chLeft = s.charAt(left);

                if (tMap.containsKey(chLeft) && (windowMap.get(chLeft).equals(tMap.get(chLeft))))
                    matched--;


                windowMap.put(chLeft, windowMap.get(chLeft) - 1);
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
        
}