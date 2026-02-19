class Solution {
  
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i<prices.length; i++){
                if(prices[i]<minVal)
                    minVal=prices[i];

                maxProfit =  Math.max(maxProfit, prices[i] - minVal);
        }
        return maxProfit;
    }
}




//If you plot out the values of the array into a line chart, you'll see that you're basically just looking for a start point that is the lowest point on the graph and an end point which is the highest. So as you're iterating through the array, there's only two possible cases

//