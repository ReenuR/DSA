class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        

        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i =0; i<candies.length; i++){
            max = Math.max(candies[i], max);
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max)
            result.add(true);
            else 
            result.add(false);
        }
        return result;
    }
}

//brute froce
        /**I ll find the max in candies and then after adding xtraCandies, if its is less then the max its false else true.
        n + n ==> 2n */