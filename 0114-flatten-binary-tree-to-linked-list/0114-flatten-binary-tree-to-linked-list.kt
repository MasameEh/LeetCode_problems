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

    fun preOrder(root: TreeNode?){
        if(root == null){
            return
        }
        preOrder(root.left)
        preOrder(root.right)

        val temp1 = root.left
        val temp2 = root.right


        root.left = null
        root.right = temp1

        var curr = root
        while(curr?.right != null){
            curr= curr.right
        }
        curr?.right = temp2
    }

    fun flatten(root: TreeNode?): Unit {

        preOrder(root)
    }
}