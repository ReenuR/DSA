class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        for(int left=0, right = str.length()-1; left<right; left++, right-- ){
            if(str.charAt(left)!=str.charAt(right))
                return false;
        }
        return true;
    }
}
//char [] ch 