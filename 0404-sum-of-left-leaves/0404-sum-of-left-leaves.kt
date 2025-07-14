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
    companion object {
        var sum = 0
    }
    fun traverseTree(root: TreeNode?){
        if(root == null) return
        val left = root.left
        if (left != null && left.left == null && left.right == null) {
            sum += left.`val`
        }
        traverseTree(root?.left)
        traverseTree(root?.right)
    }
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        sum = 0
        traverseTree(root)
        return sum
    }
}