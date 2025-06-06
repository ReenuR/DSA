class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        char[] ch = blocks.toCharArray();
    
        for(int left = 0, right = 0; right <blocks.length(); right++){
            
            if(ch[right] == 'W')
                count++;

            if(right-left+1 == k){
                min = Math.min(min, count);
            
            if(ch[left] == 'W')
            count--;    
            left++;
            }
        }   
        return min;
    }
}