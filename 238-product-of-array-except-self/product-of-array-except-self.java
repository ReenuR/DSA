class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
    int[] ans = new int[n];

    // 1) Left products
    int leftProd = 1;
    for (int i = 0; i < n; i++) {
        ans[i] = leftProd;         // product of all elements to the left of i
        leftProd *= nums[i];
    }

    // 2) Multiply with right products
    int rightProd = 1;
    for (int i = n - 1; i >= 0; i--) {
        ans[i] *= rightProd;       // multiply with product of all elements to the right of i
        rightProd *= nums[i];
    }

    return ans;
    }
}