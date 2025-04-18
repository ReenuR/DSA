class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length = word1.length() + word2.length();
        char[] mergedArr = new char[length];
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();
        int i=0, j=0, k=0;
        while( i<word1.length() && j< word2.length())  {
            mergedArr[k] = str1[i++];
            mergedArr[++k] = str2[j++];
            k++;
        } 
        
        while(i<word1.length()){
            mergedArr[k++] = str1[i++];
        }
        while(j< word2.length()){
            mergedArr[k++] = str2[j++];
        }

        return new String(mergedArr);
    }
}


/* Aug 16th 2023
int n = word1.length() + word2.length();
        char str3 [] = new char[n];
        char str1[] = word1.toCharArray();
        char str2[] = word2.toCharArray();
        for (int i=0, j=0; j<n; i++,j++ ){
                if(i< word1.length() && i < word2.length()){
                    str3[j] = str1[i];
                    str3[++j] = str2[i];
                }
                else{
                    if(i < word1.length())
                    str3[j] = str1[i];
                    else if(i < word2.length())
                    str3[j] = str2[i];
        
                }
        }
        return new String (str3);
*/