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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que = new ArrayDeque<>();
        List<List<Integer>> result = new LinkedList<>();

        if(root == null)
            return result;
        
        que.offer(root);

        while (!que.isEmpty()) {

            List<Integer> levelList = new LinkedList<>();
            int levelSize = que.size();

            while (levelSize > 0) {
                TreeNode temp = que.poll();

                //add its children in queue
                if(temp.left != null) que.offer(temp.left);
                if(temp.right != null) que.offer(temp.right);
                levelList.add(temp.val);
                levelSize--;
            }
            result.add(levelList);
        }
        return result;
    }
}