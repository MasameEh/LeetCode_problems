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
    fun deleteMiddle(head: ListNode?): ListNode? {
        if(head?.next == null){
            return null
        }
        var size = 0 
        var traverseNode = head
        while(traverseNode?.next != null){
            traverseNode = traverseNode.next
            size++
        }
        val midIndex = if(size % 2 == 0 ) size / 2 else (size / 2) + 1
        traverseNode = head
        var prev = head
        for(i in 0..midIndex - 1){
            prev = traverseNode
            traverseNode = traverseNode?.next
        }
        prev?.next = traverseNode?.next
        traverseNode?.next = null
        return head
    }
}