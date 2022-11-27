/**
 * 获取链表倒数第k个节点
 * 使用双指针，移动到最后时，倒数第1个节点和倒数第k节点相差k-1
 */
public class GetLastNode {
    public ListNode getLastNode(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode current = head;
        ListNode fast = head;
        for (int i = 1; i < k; i++) {
            if (fast == null) {
                return null;
            }

            fast = fast.next;
        }

        while (fast != null && fast.next != null) {
            current = current.next;
            fast = fast.next;
        }

        return current;
    }
}
