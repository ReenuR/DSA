class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];
        // I need to track minimum value till today and see profit from it and store it. 

        for(int i=1; i<prices.length; i++){
            
            minSoFar = Math.min(minSoFar, prices[i]);

            maxProfit = Math.max(maxProfit, prices[i]-minSoFar);

        }
        return maxProfit;

    }
}

/** int maxProfit = -1;
        int profit = 0;
        int currentProfit = 0;

        for(int i=0; i< prices.length; i++){
            for (int j = i+1; j<prices.length; j++){

                if(prices[i] < prices[j]){
                    currentProfit = prices[j] - prices[i];
                }
                profit = Math.max(profit, currentProfit);
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit; */