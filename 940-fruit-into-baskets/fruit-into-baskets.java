class Solution {
    public int totalFruit(int[] fruits) {
          int maxLen = -1;

        HashMap<Integer, Integer> basket = new HashMap<>();
        int start = 0, end =0;
        for( int l = 0, r = 0;r<fruits.length; r++){
            int fruit = fruits[r];

            basket.put(fruit, basket.getOrDefault(fruit,0)+1);

            while(basket.size()>2){
                int fruitLeft =fruits[l]; 
                basket.put(fruitLeft, basket.get(fruitLeft)-1);
                if(basket.get(fruitLeft) == 0)
                    basket.remove(fruitLeft);
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);

        }
        return maxLen;
    }
}
/**

OP--> max no.of trees i visit(fruits[i])

 */