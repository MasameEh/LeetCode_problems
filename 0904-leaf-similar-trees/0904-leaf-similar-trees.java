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
    private List<Integer> leafs1 = new ArrayList();
    private List<Integer> leafs2 = new ArrayList();

    private void dfs(TreeNode root, boolean isOne){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(isOne){
                leafs1.add(root.val);  
            }else{
                leafs2.add(root.val);  
            }
        }else{
            dfs(root.left, isOne);
            dfs(root.right, isOne);
        }

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        dfs(root1, true);
        dfs(root2, false);

        return leafs1.equals(leafs2);
    }
}