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
    static void inorder(TreeNode? root, List<int> values)
    {
        if (root != null) {
            inorder(root.right, values);
            print("   ${root.val}");
            values.add(root.val);
            inorder(root.left, values);
        }
    }

  TreeNode? bstToGst(TreeNode? root) {
    List<int> values = [];
    Solution.inorder(root, values);
    Map<int,int> sumMap = {};
    int sum = 0;
    values.sort();

    for(int i = values.length-1; i >= 0; i--)
    {
        sum += values[i];
        sumMap[values[i]] = sum;
    }

    void assignValues(TreeNode? root){
        if(root == null) return;

        root.val = sumMap[root.val]!;

        assignValues(root.right);
        assignValues(root.left);
    }

    assignValues(root);

    return root;
  }
}