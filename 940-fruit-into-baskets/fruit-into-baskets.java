class Solution {
    public int totalFruit(int[] fruits) {

        int maxLen = 0;
        int k = 0;
        HashMap<Integer, Integer> fruitBasket = new HashMap<>();
        for(int right =0, left = 0; right<fruits.length; right++){
           if(!fruitBasket.containsKey(fruits[right]))
            { k++;}
            fruitBasket.put(fruits[right], fruitBasket.getOrDefault(fruits[right], 0)+1);
           
           

            while(k>2){
                int fruitAtLeft = fruits[left];
                fruitBasket.put(fruitAtLeft, fruitBasket.get(fruitAtLeft) - 1);
                if(fruitBasket.get(fruits[left]) == 0){
                     k--;
                     fruitBasket.remove(fruits[left]);
                }
                    
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }  
        
        return maxLen;
    }
}
/**

OP--> max no.of trees i visit(fruits[i])

 */