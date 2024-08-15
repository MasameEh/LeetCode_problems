/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] distances = {-1,-1};
        if (head == null || head.next == null || head.next.next == null) {
         // If the list has fewer than 3 nodes, there can't be any critical points.
            return distances;
        }

        List<Integer> criticalPositions = new ArrayList<>();
    
        int index = 1;

        while(head != null && head.next != null && head.next.next != null)
        {
            ListNode prevNode = head;
            head = head.next;
            ListNode nextNode = head.next;
            index++;

            if((head.val > prevNode.val && head.val > nextNode.val) ||
                (head.val < prevNode.val && head.val < nextNode.val))
            {
                criticalPositions.add(index);
            }
        }

        if(criticalPositions.size() < 2)
        {
            return distances;
        }

        int minDistance = criticalPositions.get(1) - criticalPositions.get(0);
        distances[1] = criticalPositions.get(criticalPositions.size() - 1) - criticalPositions.get(0);

        for (int i = 1; i < criticalPositions.size(); i++) {
        int distance = criticalPositions.get(i) - criticalPositions.get(i - 1);
        if (distance < minDistance) {
            minDistance = distance;
        }
        }
        distances[0] = minDistance;

        return distances;
    }
}