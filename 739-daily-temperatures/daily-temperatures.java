class Solution {
    public int[] dailyTemperatures(int[] temp) {
       int[] answer = new int[temp.length];

       Deque<Integer> stack = new ArrayDeque<>();

       for(int i = 0; i<temp.length; i++){
        int currentTemp = temp[i];
        
        while(!(stack.isEmpty()) && currentTemp > temp[stack.peek()]){
                answer[stack.peek()] = i-stack.pop();
            }
        
        stack.push(i);

       }

       return answer; 

    }

}