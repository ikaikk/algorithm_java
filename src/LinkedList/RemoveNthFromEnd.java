package LinkedList;

public class RemoveNthFromEnd {

    /**
     *
     * @param head ListNode类
     * @param n int整型
     * @return ListNode类
     */
    public static ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if (null == head) {
            return null;
        }

        ListNode left = head;
        ListNode right = head;
        ListNode start = null;
        int len = 1;

        while (right != null) {
            if (len >= n + 1) {
                start = left;
                left = left.next;
            }

            len++;
            right = right.next;
        }

        if (null == start) {
            return left.next;
        }
        start.next = left.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode listNode = removeNthFromEnd(head, 2);

        while (listNode != null) {
            System.out.printf(listNode.val + ",");
            listNode = listNode.next;
        }
        System.out.println();
    }
}
