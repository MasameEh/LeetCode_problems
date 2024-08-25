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

    void Inorder(TreeNode? root)
    {
        if(root != null) {
            Inorder(root.left);
            sortedList.add(root.val);
            Inorder(root.right);
        }
    }
  List<int> inorderTraversal(TreeNode? root) {

    Inorder(root);
    return sortedList;
  }
}