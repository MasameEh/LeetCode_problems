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
    private fun inOrder(root: TreeNode?, `val`: Int): TreeNode?{
        var node = root
        if(root == null) return null

        if (`val` == node?.`val`) {
            return node
        }

        val leftResult = inOrder(root.left, `val`)
        if (leftResult != null) {
            return leftResult
        }

        return inOrder(root.right, `val`)
    }
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {

        return inOrder(root, `val`)
    }
}