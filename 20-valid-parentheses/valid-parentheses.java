class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char[] charArray = s.toCharArray();
        for(int i = 0; i<charArray.length; i++){
            if(stack.isEmpty()){
                stack.push(charArray[i]);    
            }else{
                if(stack.peek()=='{' && charArray[i] == '}' ||
                stack.peek()=='[' && charArray[i] == ']'||
                stack.peek()=='(' && charArray[i] == ')')
                stack.pop();
                else
                    stack.push(charArray[i]);
            }
        }
        return stack.size() == 0; 
    }
}