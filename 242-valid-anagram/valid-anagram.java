class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int [] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            char charAtS = s.charAt(i);
            char charAtT = t.charAt(i);
            arr[charAtS-'a']++;
            arr[charAtT-'a']--;
        }

        for(int i =0; i<arr.length; i++){
            if(arr[i] !=0)
                return false;
        }

        return true;

    }
}