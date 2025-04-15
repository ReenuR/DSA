class Solution {
    public int maxArea(int[] height) {
        /* first - find the longest line 
            keep looking for next line which gives max area. i.e. 
            Max Area =j-i x min (height(i),height(j))  (Distance x Heigh)*/
        int maxArea = 0;
        int minHeight = height[0];

     for(int left=0, right = height.length - 1; left<right; ){
        int width = right-left;
           maxArea = Math.max(maxArea, Math.min(height[left], height[right])* width);
           if(height[left] <= height[right])
            left++;
            else right--;

        }
        return maxArea;
     }
}