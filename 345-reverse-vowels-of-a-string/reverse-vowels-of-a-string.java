class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char [] chArr = s.toCharArray();
        while(left<right){
            while(left < right && !isVowel(chArr[left])){
                left++;
            }
            while(left < right && !isVowel(chArr[right])){
                right--;
            }
            char temp = chArr[left];
            chArr[left] = chArr[right];
            chArr[right] = temp;
            left++;
            right--;
        }

        return String.valueOf(chArr);
    }
    public boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c=='a'|| c =='e'|| c =='i'|| c =='o'|| c =='u';
    }
}

/** We will use two pointer, 1 is for left and other fr right. keep moving until u find vowel and then swap left with right. */