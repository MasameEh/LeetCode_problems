/**
 * Definition for a binary tree node.
 * class TreeNode {
 *   int val;
 *   TreeNode? left;
 *   TreeNode? right;
 *   TreeNode([this.val = 0, this.left, this.right]);
 * }
 */
class Solution {
    List<int> res = [];

    void preOrder(TreeNode? root)
    {
        if(root != null) {
            res.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
  List<int> preorderTraversal(TreeNode? root) {
    preOrder(root);
    return res;
  }
}