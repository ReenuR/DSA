class Solution {
    public boolean checkInclusion(String pattern, String str) {
        if (pattern.length() > str.length())
            return false;
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        int matched = 0;
        for (int left = 0, right = 0; right < str.length(); right++) {
            char curChar = str.charAt(right);
            if (freqMap.containsKey(curChar)) {
                freqMap.put(curChar, freqMap.get(curChar) - 1);
                if (freqMap.get(curChar) == 0)
                    matched++;
            }
            if (matched == (freqMap.size()))
                return true;
            if (right >= pattern.length()-1) {
                char charAtLeft = str.charAt(left++);
                if(freqMap.containsKey(charAtLeft)){
                    if (freqMap.get(charAtLeft) == 0)
                        matched--;
                    freqMap.put(charAtLeft, freqMap.get(charAtLeft) + 1);
                }
            }
        }

        return false;

    }
}

/**
//
        if(pattern.length() > str.length())
            return false;

        HashMap<Character,Integer> freqPattern = new HashMap<>();
        HashMap<Character,Integer> freqStr = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            freqPattern.put(ch, freqPattern.getOrDefault(ch,0)+1);
        }

        int pattrnWindowSize = pattern.length();
        for(int l=0, r=0; r<str.length(); r++){

            if(r<pattrnWindowSize){
                freqStr.put(str.charAt(r),freqStr.getOrDefault(str.charAt(r),0)+1);
            }

            while(r-l+1 > pattrnWindowSize){
                char oldCh = str.charAt(l);
                freqStr.put(oldCh, freqStr.get(oldCh)-1);
                if(freqStr.get(oldCh) == 0)
                    freqStr.remove(oldCh);
                l++;
                freqStr.put(str.charAt(r),freqStr.getOrDefault(str.charAt(r),0)+1);

            }
            if(freqPattern.equals(freqStr))
                return true;
        }
        return (freqPattern.equals(freqStr));
 */