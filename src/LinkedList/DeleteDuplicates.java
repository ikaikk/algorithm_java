package LinkedList;

/**
 * 力扣83，删除有序链表中重复元素
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (null == head) {
            return null;
        }

        ListNode currentNode = head;
        while (null != currentNode.next) {
            if (currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}