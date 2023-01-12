package LinkedList;

public class IsPail {
    /**
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public static boolean isPail(ListNode head) {
        // write code here
        ListNode left = head;
        ListNode right = head;

        while (right != null && right.next != null) {
            left = left.next;
            right = right.next.next;
        }

        if (right != null) {
            left = left.next;
        }

        ListNode tail = reverse(left);
        while (null != tail) {
            if (head.val != tail.val) {
                return false;
            }

            tail = tail.next;
            head = head.next;
        }

        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode pre = null;
        while (current != null) {
            ListNode tempNode = current.next;
            current.next = pre;
            pre = current;
            current = tempNode;
        }

        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        ListNode temp = head.next.next.next.next = new ListNode(1);
        temp.next = new ListNode(1);

        System.out.println(isPail(head));
    }
}
