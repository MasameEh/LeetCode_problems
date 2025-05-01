/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    val leafs1 =  mutableListOf<Int>()
    val leafs2 = mutableListOf<Int>()

    fun dfs(root: TreeNode?, leafs : MutableList<Int>){
        if(root == null){
            return
        }

        if(root?.left == null && root?.right == null){
            leafs.add(root.`val`)
        }else{
            dfs(root.left, leafs)
            dfs(root.right, leafs)
        }
    }
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        dfs(root1, leafs1)
        dfs(root2, leafs2)

        return leafs1 == leafs2
    }
}