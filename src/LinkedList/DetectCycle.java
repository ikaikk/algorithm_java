package LinkedList;

/**
 * 力扣142，环形列表2，返回链表开始入环的第一个节点
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if (null == head) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        boolean isCycle = false;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                isCycle = true;
                break;
            }
        }

        if (isCycle) {
            ListNode ptr = head;
            while (ptr != slow) {
                ptr = ptr.next;
                slow = slow.next;
            }

            return ptr;
        }

        return null;
    }
}
