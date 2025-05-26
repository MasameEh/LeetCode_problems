class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        var p1 = if (list1.`val` < list2.`val`) list1 else list2
        var temp1 = if (list1.`val` < list2.`val`) list1.next else list2.next
        var temp2 = if (list1.`val` < list2.`val`) list2 else list1

        val head = p1 

        while (temp1 != null && temp2 != null) {
            if (temp1.`val` > temp2.`val`) {
                p1?.next = temp2
                temp2 = temp2.next
            } else {
                p1?.next = temp1
                temp1 = temp1.next
            }
            p1 = p1.next
        }

        p1?.next = temp1 ?: temp2

        return head
    }
}
