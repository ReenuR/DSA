class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<int[]> stack = new ArrayDeque<>();
        int count =0;
        for(int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);

            if(stack.isEmpty()){
                stack.push(new int[] {currentChar, 1});
            }
            else{
                if(stack.peek()[0] == currentChar){
                    count = stack.pop()[1] + 1;
                    if(count < k)
                    stack.push(new int[]{currentChar, count});
                    
                }
                else
                 stack.push(new int[] {currentChar, 1});
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int[] entry : stack){
            char ch = (char)entry[0];
            int freq = entry[1];
            sb.append(String.valueOf(ch).repeat(freq));
        }
        return sb.reverse().toString();
        
    }
}