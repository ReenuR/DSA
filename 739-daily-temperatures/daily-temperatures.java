class Solution {
    public int[] dailyTemperatures(int[] temp) {
    Deque<Integer> stack = new ArrayDeque<>();
    int[] answer = new int[temp.length];

    for(int i = 0; i< temp.length; i++){
         while(!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                int indx = stack.pop();
                answer[indx] = i - indx;
            }
        stack.push(i);
    }
    return answer;
    }

}