class Solution {
    public boolean checkInclusion(String pattern, String str) {

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

    }
}