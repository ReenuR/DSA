class Solution {
    public void reverseString(char[] s) {
        for(int left = 0, right = s.length-1;left < right; left++, right--){
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;
        }
    }
}