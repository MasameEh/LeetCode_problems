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
                
        if(`val` == node?.`val`){
        
            return node
        }
   
    val leftResult = inOrder(node?.left, `val`)
    if (leftResult != null) {
        return leftResult
    }

    // Search in the right subtree
    val rightResult = inOrder(node?.right, `val`)
    if (rightResult != null) {
        return rightResult
    }

        return null
    }
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        var node = root
        if(root == null) return null
        if(node.`val` == `val`) return node

        if(`val` > node.`val`){
            return searchBST(node.right, `val`)
        }else return searchBST(node.left,`val`)
        return null
    }
}