class Solution {
    int sum = 0;

    private boolean inOrder(TreeNode node, int targetSum) {
        if (node == null) 
        {
            return false;
        }

        sum += node.val;

        // Check if we've reached a leaf node with the target sum
        if(node.left == null && node.right == null && sum == targetSum) 
        {
            return true;
        }

        // Recur for left and right subtrees
        if(inOrder(node.left, targetSum) || inOrder(node.right, targetSum)) 
        {
            return true;
        }

        // Backtrack: subtract the current node's value from the running sum
        sum -= node.val;
        return false;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return inOrder(root, targetSum);
    }
}
