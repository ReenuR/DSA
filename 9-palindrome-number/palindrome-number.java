class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;

        int reverse = 0;
        int lastDigit;
        int num = x;
        while(num>0){
            lastDigit = num%10;
            reverse = reverse * 10 + lastDigit;
            num = num/10; 
        }
        return reverse == x;
    }
}