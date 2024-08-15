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
    List<Integer> sortedList = new ArrayList<>();

    // Inorder traversal to get elements in sorted order
    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            sortedList.add(root.val);
            inorder(root.right);
        }
    }
    
    // Function to convert sorted list to balanced BST
    TreeNode sortedListToBST(int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(
            sortedList.get(mid), 
            sortedListToBST(start, mid - 1),  
            sortedListToBST(mid + 1, end)
        );
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return sortedListToBST(0, sortedList.size() - 1);
    }
}