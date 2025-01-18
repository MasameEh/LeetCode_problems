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
    int sum = 0;
    List<Integer> sums = new ArrayList<>();

    private void inOrder(TreeNode node){
        if(node == null){
            return;
        }
        //System.out.println( node.val);
        sum += node.val;
        inOrder(node.left);
        if(node.left != null) sum -= node.left.val;

        inOrder(node.right);
        if(node.right != null) sum -= node.right.val;

        if(node.right == null && node.left == null){
            sums.add(sum);
        }
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        inOrder(root);
        for(int sum : sums){
            if(sum == targetSum) {
                return true;
            }
        }
        return false;
    }
}