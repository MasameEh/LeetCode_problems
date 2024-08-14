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
    
    TreeNode? sortedListToBST(int start, int end)
    {
        if(start > end)
        {
            return null;
        }
        var mid = start + (end-start)~/2;

        TreeNode? node = new TreeNode(sortedList[mid], sortedListToBST(start, mid-1),  
                                    sortedListToBST(mid+1,end));

        return node;
    }
  TreeNode? balanceBST(TreeNode? root) {
    Inorder(root);
    print(sortedList);
    return sortedListToBST(0, sortedList.length-1);
  }
}