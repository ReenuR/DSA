/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        Deque<Integer>  state = new ArrayDeque<>();

        if(root == null)
        return false;

        int currSum = 0;
        stack.push(root);
        state.push(root.val);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            currSum = state.pop();

            if(node.right != null){
                stack.push(node.right);
                state.push(currSum + node.right.val);
            }
            if(node.left != null){
                stack.push(node.left);
                state.push(currSum + node.left.val);
            }
            if(node.right == null && node.left == null && currSum == targetSum)
            return true;
        }
        return false;
    }
}