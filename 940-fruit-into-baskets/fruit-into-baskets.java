class Solution {
    public int totalFruit(int[] fruits) {
        // return sum of all the values present in map

        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, right =0;
        int maxFruits = 0;
        
        while(right < fruits.length){
            int fruit = fruits[right];
            basket.put(fruit, basket.getOrDefault(fruit, 0)+1);

            while(basket.size() > 2){
                basket.put(fruits[left],basket.get(fruits[left])-1);
                if(basket.get(fruits[left]) == 0){
                    basket.remove(fruits[left]);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits, right - left + 1);;
            right++;
            
        }
        return maxFruits;
    }
}