class Solution {
    public int maxVowels(String s, int k) {
        int maxVowel = 0;
        int vowelCount = 0;
        for(int right =0, left = 0; right<s.length(); right++){
            if(isVowel(s.charAt(right)))
                vowelCount++;
            if(right >= k-1){
                maxVowel = Math.max(maxVowel, vowelCount);
                if(isVowel(s.charAt(left)))
                    vowelCount--;
                    left++;
            }
        }
        return maxVowel;
    }
    public boolean isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
            
    }
}