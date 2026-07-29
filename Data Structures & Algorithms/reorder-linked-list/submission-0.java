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

    public void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        ListNode mid = getMid(head);

        ListNode second = reverse(mid.next);

        mid.next = null;

        merge(head, second);
    }

    private ListNode getMid(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;

        while (head != null) {

            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    private void merge(ListNode l1, ListNode l2) {

        while (l1 != null && l2 != null) {

            ListNode next1 = l1.next;
            ListNode next2 = l2.next;

            l1.next = l2;
            l2.next = next1;

            l1 = next1;
            l2 = next2;
        }
    }
}