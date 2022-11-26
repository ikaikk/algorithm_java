/**
 * 力扣206，反转链表
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = result;
            result = current;
            current = next;
        }

        return result;
    }
}
