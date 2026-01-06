class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int left, right;
        for(int i =0 ; i<flowerbed.length && n>0; i++){
           left = i==0? 0:flowerbed[i-1];
           right = i == flowerbed.length-1 ? 0 : flowerbed[i+1];

            if(left == 0 && right == 0 && flowerbed[i] == 0){
                n--;
                flowerbed[i] =1;
            }
            
        }

        return n==0;
        }
}
/**while n!=0 && i< flowerbed.length --> keep going subtracting n, 
if loop breaks check value of n.. if its  > 0 & i< floerbed .length return false else true */