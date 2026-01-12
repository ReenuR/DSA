class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] subStr = s.toCharArray();
        int i=0;
        for( int j=0; i < s.length() && j<t.length(); j++){
            if(subStr[i] == t.charAt(j)){
                i++;
            }
        }
        return i >= s.length();
    }
}