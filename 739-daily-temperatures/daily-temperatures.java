class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int size = temp.length;
        int [] result = new int[size];

        Deque<Integer> stack = new ArrayDeque<>();
        for(int i =0; i<size; i++){
            while(!stack.isEmpty() && temp[i] > temp[stack.peek()]){
               int prevIndex = stack.pop();
               result[prevIndex] = i - prevIndex;
            }
            stack.push(i);

        }
        return result;
    }

}