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
    public int maxDepth(TreeNode root) 
    {
        return dfs(root);
    }

    private int dfs(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            int left = (dfs(root.left) + 1);
            int right = (dfs(root.right) + 1);
            return Math.max(left, right);
        }
    }
}