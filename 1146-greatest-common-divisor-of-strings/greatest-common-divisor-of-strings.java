class Solution {
    public String gcdOfStrings(String str1, String str2) {
            if(!((str1+str2).equals(str2+str1)))
            return "";
            int a = str1.length();
            int b = str2.length();
            int gcd = gcd(a,b);
            return str1.substring(0,gcd);
    }
    int gcd(int a, int b){
        
        while(b!=0){
           int temp = a%b;
           a=b;
           b=temp;
        }
        return a;
    }
}