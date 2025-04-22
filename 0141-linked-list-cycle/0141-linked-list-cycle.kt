/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        val set = mutableSetOf<ListNode>()
        var traversNode = head

        while(traversNode?.next != null){
            if(set.contains(traversNode)){
                return true;
            }
            set.add(traversNode)
            traversNode = traversNode.next
        }

        return false
    }
}