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
    List<int> sortedList = [];

    void postOrder(TreeNode? root)
    {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            sortedList.add(root.val);
        }
    }
  List<int> postorderTraversal(TreeNode? root) {
   
    postOrder(root);
    return sortedList;
  }
}